.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/W;->q:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/W;->q:Landroid/content/Context;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->c(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object p0

    return-object p0
.end method
