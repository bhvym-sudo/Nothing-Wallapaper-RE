.class public final Lcom/nothing/wallpaper/widget/MoreGuideView$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/widget/MoreGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/widget/MoreGuideView;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/widget/MoreGuideView;Landroid/os/Looper;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$d;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 3

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$d;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {v0}, Lcom/nothing/wallpaper/widget/MoreGuideView;->g(Lcom/nothing/wallpaper/widget/MoreGuideView;)Z

    move-result v0

    if-eqz v0, :cond_1a

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1a

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/MoreGuideView$d;->a:Lcom/nothing/wallpaper/widget/MoreGuideView;

    invoke-static {p0}, Lcom/nothing/wallpaper/widget/MoreGuideView;->i(Lcom/nothing/wallpaper/widget/MoreGuideView;)V

    :cond_1a
    return-void
.end method
