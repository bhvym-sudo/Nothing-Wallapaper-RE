.class public final LW6/U$i;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/U;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW6/U;


# direct methods
.method constructor <init>(LW6/U;Landroid/os/Looper;)V
    .registers 3

    iput-object p1, p0, LW6/U$i;->a:LW6/U;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 3

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0xa

    if-ne p1, v0, :cond_1e

    iget-object p1, p0, LW6/U$i;->a:LW6/U;

    invoke-virtual {p1}, LW6/i;->x0()Z

    move-result p1

    if-eqz p1, :cond_18

    iget-object p1, p0, LW6/U$i;->a:LW6/U;

    invoke-static {p1}, LW6/U;->y1(LW6/U;)V

    :cond_18
    iget-object p0, p0, LW6/U$i;->a:LW6/U;

    const/4 p1, 0x1

    invoke-static {p0, p1}, LW6/U;->v1(LW6/U;Z)V

    :cond_1e
    return-void
.end method
