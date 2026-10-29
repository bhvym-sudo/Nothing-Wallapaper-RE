.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/r;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/r;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->m(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
