.class public abstract Lj7/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lp7/a;Lg3/x;Lx6/k;LD6/f;)Landroidx/lifecycle/d0$c;
    .registers 11

    const-string v0, "editFrom"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperDataSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LG6/e;->s(Lg3/x;)Z

    move-result v6

    new-instance v1, Lj7/n$a;

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lj7/n$a;-><init>(Lp7/a;Lg3/x;LD6/f;Lx6/k;Z)V

    return-object v1
.end method
