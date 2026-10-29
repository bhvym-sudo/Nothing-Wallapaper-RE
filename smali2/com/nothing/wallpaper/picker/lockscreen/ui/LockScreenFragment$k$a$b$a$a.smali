.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a;->a(LN1/a;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

.field final synthetic b:LN1/a;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LN1/a;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;->b:LN1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object p1

    if-nez p1, :cond_11

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_11
    iget-object p1, p1, Le3/u;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;->b:LN1/a;

    invoke-virtual {p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->d(LN1/a;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object p1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$b$a$a;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O()Z

    move-result p0

    if-eqz p0, :cond_29

    const/high16 p0, 0x3f800000    # 1.0f

    goto :goto_2a

    :cond_29
    const/4 p0, 0x0

    :goto_2a
    invoke-interface {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->h(F)V

    return-void
.end method
