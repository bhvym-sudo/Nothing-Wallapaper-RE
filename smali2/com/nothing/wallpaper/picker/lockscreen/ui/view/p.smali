.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

.field public final synthetic s:LO1/b;

.field public final synthetic t:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;->q:Landroid/view/View;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;->s:LO1/b;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;->t:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;->q:Landroid/view/View;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;->s:LO1/b;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;->t:Landroid/view/View;

    invoke-static {v0, v1, v2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->q(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
