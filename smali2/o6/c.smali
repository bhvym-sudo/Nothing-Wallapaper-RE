.class public final Lo6/c;
.super Lcom/bumptech/glide/TransitionOptions;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/c$a;
    }
.end annotation


# static fields
.field public static final q:Lo6/c$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lo6/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo6/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lo6/c;->q:Lo6/c$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/bumptech/glide/TransitionOptions;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(I)Lo6/c;
    .registers 3

    new-instance v0, Lo6/b$a;

    invoke-direct {v0, p1}, Lo6/b$a;-><init>(I)V

    invoke-virtual {p0, v0}, Lo6/c;->d(Lo6/b$a;)Lo6/c;

    move-result-object p0

    return-object p0
.end method

.method public final d(Lo6/b$a;)Lo6/c;
    .registers 3

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lo6/b$a;->a()Lo6/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo6/c;->e(Lo6/b;)Lo6/c;

    move-result-object p0

    return-object p0
.end method

.method public final e(Lo6/b;)Lo6/c;
    .registers 3

    const-string v0, "drawableCrossFadeFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/TransitionOptions;->transition(Lcom/bumptech/glide/request/transition/TransitionFactory;)Lcom/bumptech/glide/TransitionOptions;

    move-result-object p0

    const-string p1, "transition(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lo6/c;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, Lo6/c;

    if-eqz v0, :cond_c

    invoke-super {p0, p1}, Lcom/bumptech/glide/TransitionOptions;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public hashCode()I
    .registers 1

    invoke-super {p0}, Lcom/bumptech/glide/TransitionOptions;->hashCode()I

    move-result p0

    return p0
.end method
