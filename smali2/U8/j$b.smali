.class public final LU8/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private b:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .registers 3

    const-string v0, "routes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU8/j$b;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LU8/j$b;->a:Ljava/util/List;

    return-object p0
.end method

.method public final b()Z
    .registers 2

    iget v0, p0, LU8/j$b;->b:I

    iget-object p0, p0, LU8/j$b;->a:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-ge v0, p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final c()LP8/F;
    .registers 4

    invoke-virtual {p0}, LU8/j$b;->b()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, LU8/j$b;->a:Ljava/util/List;

    iget v1, p0, LU8/j$b;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LU8/j$b;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP8/F;

    return-object p0

    :cond_15
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method
