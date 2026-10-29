.class public abstract LG6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lw6/b;ZZ)Landroid/graphics/Bitmap;
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lw6/b$b;

    if-eqz v0, :cond_10

    check-cast p0, Lw6/b$b;

    invoke-virtual {p0}, Lw6/b$b;->a()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_10
    instance-of v0, p0, Lw6/b$a;

    if-eqz v0, :cond_3d

    check-cast p0, Lw6/b$a;

    invoke-virtual {p0}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object v0

    instance-of v0, v0, Lx6/c;

    if-eqz v0, :cond_29

    invoke-virtual {p0}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object p0

    check-cast p0, Lx6/c;

    invoke-virtual {p0}, Lx6/c;->y()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_29
    if-eqz p2, :cond_34

    invoke-virtual {p0}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object p0

    invoke-static {p0, p1}, LG6/a;->f(Lcom/android/wallpaper/asset/a;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_34
    invoke-virtual {p0}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object p0

    invoke-static {p0, p1}, LG6/a;->d(Lcom/android/wallpaper/asset/a;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_3d
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0
.end method

.method public static final b(Lcom/android/wallpaper/asset/a;ZLm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance v0, LF8/n;

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    new-instance v1, LG6/a$a;

    invoke-direct {v1, v0, p0, p1}, LG6/a$a;-><init>(LF8/l;Lcom/android/wallpaper/asset/a;Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v1}, Lcom/android/wallpaper/asset/a;->j(Landroid/app/Activity;Lcom/android/wallpaper/asset/a$e;)V

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_23

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_23
    return-object p0
.end method

.method public static synthetic c(Lw6/b;ZZILjava/lang/Object;)Landroid/graphics/Bitmap;
    .registers 6

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x1

    if-eqz p4, :cond_6

    move p1, v0

    :cond_6
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_b

    move p2, v0

    :cond_b
    invoke-static {p0, p1, p2}, LG6/a;->a(Lw6/b;ZZ)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/android/wallpaper/asset/a;Z)Landroid/graphics/Bitmap;
    .registers 4

    const-string v0, "asset"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG6/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LG6/a$b;-><init>(Lcom/android/wallpaper/asset/a;ZLm8/e;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LF8/g;->f(Lm8/i;Lv8/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final e(Lcom/android/wallpaper/asset/a;ZLm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance v0, LF8/n;

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    instance-of v1, p0, Lcom/android/wallpaper/asset/o;

    if-eqz v1, :cond_1c

    check-cast p0, Lcom/android/wallpaper/asset/o;

    new-instance v1, LG6/a$c;

    invoke-direct {v1, v0}, LG6/a$c;-><init>(LF8/l;)V

    invoke-virtual {p0, p1, v1}, Lcom/android/wallpaper/asset/o;->D(ZLcom/android/wallpaper/asset/a$d;)V

    goto :goto_25

    :cond_1c
    new-instance v1, LG6/a$d;

    invoke-direct {v1, v0, p0, p1}, LG6/a$d;-><init>(LF8/l;Lcom/android/wallpaper/asset/a;Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v1}, Lcom/android/wallpaper/asset/a;->j(Landroid/app/Activity;Lcom/android/wallpaper/asset/a$e;)V

    :goto_25
    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_32

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_32
    return-object p0
.end method

.method public static final f(Lcom/android/wallpaper/asset/a;Z)Landroid/graphics/Bitmap;
    .registers 4

    const-string v0, "asset"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG6/a$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LG6/a$e;-><init>(Lcom/android/wallpaper/asset/a;ZLm8/e;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LF8/g;->f(Lm8/i;Lv8/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method
