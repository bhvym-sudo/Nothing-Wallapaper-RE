.class public abstract Lcom/nothing/wallpaper/common/log/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Landroid/os/Looper;
    .registers 2

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/log/a;->b(Ljava/lang/String;I)Landroid/os/Looper;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;I)Landroid/os/Looper;
    .registers 3

    new-instance v0, Landroid/os/HandlerThread;

    invoke-direct {v0, p0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p0

    return-object p0
.end method
