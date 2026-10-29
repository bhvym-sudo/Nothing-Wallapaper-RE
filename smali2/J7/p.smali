.class public abstract LJ7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZLandroidx/lifecycle/Q;)LJ7/o;
    .registers 3

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_d

    new-instance p0, LJ7/a;

    invoke-direct {p0, p1}, LJ7/a;-><init>(Landroidx/lifecycle/Q;)V

    return-object p0

    :cond_d
    sget-object p0, LJ7/l;->a:LJ7/l;

    return-object p0
.end method
