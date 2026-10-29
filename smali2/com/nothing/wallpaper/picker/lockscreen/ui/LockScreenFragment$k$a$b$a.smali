.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LN1/a;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onClockSize Changed: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "LockScreenFragment"

    invoke-static {v0, p2}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object p2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p2}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_4d

    invoke-virtual {p2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_4d

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object p2

    if-nez p2, :cond_36

    const-string p2, "binding"

    invoke-static {p2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_36
    iget-object p2, p2, Le3/u;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;

    invoke-virtual {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->d(LN1/a;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object p1

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O()Z

    move-result p0

    if-eqz p0, :cond_48

    const/high16 p0, 0x3f800000    # 1.0f

    goto :goto_49

    :cond_48
    const/4 p0, 0x0

    :goto_49
    invoke-interface {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->h(F)V

    goto :goto_55

    :cond_4d
    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;

    invoke-direct {v0, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LN1/a;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :goto_55
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LN1/a;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a;->a(LN1/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
