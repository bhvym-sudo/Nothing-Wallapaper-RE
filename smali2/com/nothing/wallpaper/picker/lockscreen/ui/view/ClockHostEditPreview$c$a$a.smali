.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lv8/a;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/view/View;Lv8/a;)V
    .registers 4

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;->c:Lv8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 4

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->w(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)Le3/c;

    move-result-object p1

    iget-object p1, p1, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LO1/b;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;->b:Landroid/view/View;

    invoke-virtual {p1, v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->c(LO1/b;Landroid/view/View;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c$a$a;->c:Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method
