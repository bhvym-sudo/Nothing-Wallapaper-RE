.class public final Lg7/k$d;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg7/k;->L1(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg7/k;

.field final synthetic b:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method constructor <init>(Lg7/k;Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 3

    iput-object p1, p0, Lg7/k$d;->a:Lg7/k;

    iput-object p2, p0, Lg7/k$d;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .registers 4

    if-eqz p1, :cond_24

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    goto :goto_3b

    :cond_6
    iget-object p1, p0, Lg7/k$d;->a:Lg7/k;

    iget-object v1, p0, Lg7/k$d;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->isFakeDragging()Z

    move-result v1

    xor-int/2addr v1, v0

    invoke-static {p1, v1}, Lg7/k;->k1(Lg7/k;Z)V

    iget-object p0, p0, Lg7/k$d;->a:Lg7/k;

    invoke-static {p0}, Lg7/k;->d1(Lg7/k;)Ly7/o;

    move-result-object p0

    if-eqz p0, :cond_3b

    invoke-virtual {p0}, Ly7/o;->e()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object p0

    if-eqz p0, :cond_3b

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m4(Z)V

    return-void

    :cond_24
    iget-object p1, p0, Lg7/k$d;->a:Lg7/k;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lg7/k;->k1(Lg7/k;Z)V

    iget-object p0, p0, Lg7/k$d;->a:Lg7/k;

    invoke-static {p0}, Lg7/k;->d1(Lg7/k;)Ly7/o;

    move-result-object p0

    if-eqz p0, :cond_3b

    invoke-virtual {p0}, Ly7/o;->e()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object p0

    if-eqz p0, :cond_3b

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->m4(Z)V

    :cond_3b
    :goto_3b
    return-void
.end method

.method public onPageScrolled(IFI)V
    .registers 4

    iget-object p3, p0, Lg7/k$d;->a:Lg7/k;

    invoke-static {p3, p1, p2}, Lg7/k;->m1(Lg7/k;IF)V

    iget-object p3, p0, Lg7/k$d;->a:Lg7/k;

    invoke-static {p3, p1, p2}, Lg7/k;->l1(Lg7/k;IF)V

    iget-object p0, p0, Lg7/k$d;->a:Lg7/k;

    invoke-static {p0}, Lg7/k;->e1(Lg7/k;)Lcom/nothing/wallpaper/widget/PreviewSectionLayout;

    move-result-object p0

    if-eqz p0, :cond_15

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/widget/PreviewSectionLayout;->a(IF)V

    :cond_15
    return-void
.end method

.method public onPageSelected(I)V
    .registers 4

    iget-object v0, p0, Lg7/k$d;->a:Lg7/k;

    invoke-static {v0}, Lg7/k;->c1(Lg7/k;)Li7/a;

    move-result-object v0

    if-eqz v0, :cond_11

    sget-object v1, Lc7/a;->q:Lc7/a$a;

    invoke-virtual {v1, p1}, Lc7/a$a;->c(I)Z

    move-result p1

    invoke-virtual {v0, p1}, Li7/a;->p(Z)V

    :cond_11
    iget-object p1, p0, Lg7/k$d;->a:Lg7/k;

    invoke-static {p1}, Lg7/k;->i1(Lg7/k;)Z

    move-result p1

    if-eqz p1, :cond_45

    iget-object p1, p0, Lg7/k$d;->a:Lg7/k;

    invoke-static {p1}, Lg7/k;->g1(Lg7/k;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "start vibrate"

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LK6/c;

    iget-object p0, p0, Lg7/k$d;->a:Lg7/k;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "getApplicationContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, LK6/c;->M0(Landroid/content/Context;)Lq6/f;

    move-result-object p0

    invoke-virtual {p0}, Lq6/f;->b()V

    :cond_45
    return-void
.end method
