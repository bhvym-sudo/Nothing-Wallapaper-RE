.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->i(LN1/a;LA7/a;Lv8/l;Lv8/a;Lv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

.field final synthetic b:Lv8/a;

.field final synthetic c:Lv8/l;

.field final synthetic d:LN1/a;

.field final synthetic e:LA7/a;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Lv8/a;Lv8/l;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LN1/a;LA7/a;)V
    .registers 7

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->b:Lv8/a;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->c:Lv8/l;

    iput-object p5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->d:LN1/a;

    iput-object p6, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->e:LA7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 8

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->z(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LF8/L;

    move-result-object v0

    if-eqz v0, :cond_18

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->b:Lv8/a;

    const/4 v1, 0x0

    invoke-direct {v3, p1, p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Lv8/a;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_18
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 9

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->c:Lv8/l;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LO1/b;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LF8/T;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1b

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1b
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->z(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LF8/L;

    move-result-object v1

    if-eqz v1, :cond_36

    new-instance v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$e;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->d:LN1/a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;->e:LA7/a;

    invoke-direct {v4, v2, v3, p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$e;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LN1/a;LA7/a;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->b(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/T;

    move-result-object v0

    :cond_36
    invoke-static {p1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->F(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LF8/T;)V

    return-void
.end method
