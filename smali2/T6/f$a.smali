.class public final LT6/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT6/f;->p(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LT6/f;

.field final synthetic r:Ljava/lang/String;


# direct methods
.method constructor <init>(LT6/f;Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, LT6/f$a;->q:LT6/f;

    iput-object p2, p0, LT6/f$a;->r:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT6/f;Ljava/lang/String;)V
    .registers 2

    invoke-static {p0, p1}, LT6/f$a;->b(LT6/f;Ljava/lang/String;)V

    return-void
.end method

.method private static final b(LT6/f;Ljava/lang/String;)V
    .registers 2

    invoke-static {p0, p1}, LT6/f;->k(LT6/f;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .registers 6

    const-string p0, "resource"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "model"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "dataSource"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public onLoadFailed(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z
    .registers 6

    const-string p2, "target"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LT6/f$a;->q:LT6/f;

    invoke-static {p2}, LT6/f;->j(LT6/f;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, LT6/f$a;->q:LT6/f;

    invoke-static {p3}, LT6/f;->i(LT6/f;)I

    move-result p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onLoadFailed reload count:"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LT6/f$a;->q:LT6/f;

    invoke-static {p1}, LT6/f;->i(LT6/f;)I

    move-result p1

    iget-object p2, p0, LT6/f$a;->q:LT6/f;

    invoke-static {p2}, LT6/f;->g(LT6/f;)I

    move-result p2

    if-ge p1, p2, :cond_68

    iget-object p1, p0, LT6/f$a;->q:LT6/f;

    invoke-static {p1}, LT6/f;->h(LT6/f;)Ljava/security/SecureRandom;

    move-result-object p1

    const/16 p2, 0x64

    invoke-virtual {p1, p2}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    iget-object p2, p0, LT6/f$a;->q:LT6/f;

    invoke-static {p2}, LT6/f;->f(LT6/f;)Landroid/os/Handler;

    move-result-object p2

    iget-object p3, p0, LT6/f$a;->q:LT6/f;

    iget-object p4, p0, LT6/f$a;->r:Ljava/lang/String;

    new-instance v0, LT6/e;

    invoke-direct {v0, p3, p4}, LT6/e;-><init>(LT6/f;Ljava/lang/String;)V

    int-to-long p3, p1

    invoke-virtual {p2, v0, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object p1, p0, LT6/f$a;->q:LT6/f;

    invoke-static {p1}, LT6/f;->i(LT6/f;)I

    move-result p1

    iget-object p0, p0, LT6/f$a;->q:LT6/f;

    const/4 p2, 0x1

    add-int/2addr p1, p2

    invoke-static {p0, p1}, LT6/f;->l(LT6/f;I)V

    return p2

    :cond_68
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .registers 6

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, LT6/f$a;->c(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p0

    return p0
.end method
