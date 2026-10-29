.class public final Lo6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/request/transition/TransitionFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/b$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private b:Lo6/a;


# direct methods
.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo6/b;->a:I

    return-void
.end method

.method private final a()Lo6/a;
    .registers 3

    iget-object v0, p0, Lo6/b;->b:Lo6/a;

    if-nez v0, :cond_d

    new-instance v0, Lo6/a;

    iget v1, p0, Lo6/b;->a:I

    invoke-direct {v0, v1}, Lo6/a;-><init>(I)V

    iput-object v0, p0, Lo6/b;->b:Lo6/a;

    :cond_d
    iget-object p0, p0, Lo6/b;->b:Lo6/a;

    return-object p0
.end method


# virtual methods
.method public build(Lcom/bumptech/glide/load/DataSource;Z)Lcom/bumptech/glide/request/transition/Transition;
    .registers 3

    const-string p2, "dataSource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lo6/b;->a()Lo6/a;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method
