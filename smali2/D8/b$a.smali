.class public final LD8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final q:Ljava/util/Iterator;

.field private r:I


# direct methods
.method constructor <init>(LD8/b;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LD8/b;->d(LD8/b;)LD8/h;

    move-result-object v0

    invoke-interface {v0}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, LD8/b$a;->q:Ljava/util/Iterator;

    invoke-static {p1}, LD8/b;->c(LD8/b;)I

    move-result p1

    iput p1, p0, LD8/b$a;->r:I

    return-void
.end method

.method private final a()V
    .registers 2

    :goto_0
    iget v0, p0, LD8/b$a;->r:I

    if-lez v0, :cond_18

    iget-object v0, p0, LD8/b$a;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, LD8/b$a;->q:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, LD8/b$a;->r:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LD8/b$a;->r:I

    goto :goto_0

    :cond_18
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 1

    invoke-direct {p0}, LD8/b$a;->a()V

    iget-object p0, p0, LD8/b$a;->q:Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    return p0
.end method

.method public next()Ljava/lang/Object;
    .registers 1

    invoke-direct {p0}, LD8/b$a;->a()V

    iget-object p0, p0, LD8/b$a;->q:Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public remove()V
    .registers 2

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
