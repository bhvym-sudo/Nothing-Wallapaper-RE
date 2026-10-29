.class public final Lx6/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lw6/d;

.field private final c:Ljava/lang/String;

.field private d:LF8/x0;

.field private final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw6/d;Lv8/l;)V
    .registers 5

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/d$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lx6/d$b;->b:Lw6/d;

    invoke-static {p1}, Lx6/o;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx6/d$b;->c:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx6/d$b;->e:Ljava/util/List;

    if-eqz p3, :cond_23

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_23
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lx6/d$b;->e:Ljava/util/List;

    return-object p0
.end method

.method public final b()LF8/x0;
    .registers 1

    iget-object p0, p0, Lx6/d$b;->d:LF8/x0;

    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lx6/d$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final d()Lw6/d;
    .registers 1

    iget-object p0, p0, Lx6/d$b;->b:Lw6/d;

    return-object p0
.end method

.method public final e(LF8/x0;)V
    .registers 2

    iput-object p1, p0, Lx6/d$b;->d:LF8/x0;

    return-void
.end method
