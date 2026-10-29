.class public final Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;
.super LZ1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$a;
    }
.end annotation


# static fields
.field public static final E:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$a;


# instance fields
.field private final A:Landroid/view/animation/Animation;

.field private B:Landroid/view/View;

.field private C:LP6/a;

.field private final D:[Ljava/lang/Integer;

.field private x:Lb2/c;

.field private y:Landroid/view/View;

.field private z:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->E:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, LZ1/e;-><init>()V

    const v0, 0x7f080272

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f080265

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7f080268

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->D:[Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic G0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/content/DialogInterface;I)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->V0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic H0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/content/DialogInterface;I)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->U0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic I0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->S0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic J0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)Landroid/view/View;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->y:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic K0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)Lb2/c;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->x:Lb2/c;

    return-object p0
.end method

.method public static final synthetic L0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)LP6/a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->C:LP6/a;

    return-object p0
.end method

.method public static final synthetic M0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)Landroid/view/animation/Animation;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->A:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public static final synthetic N0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->T0()V

    return-void
.end method

.method public static final synthetic O0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Z)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->W0(Z)V

    return-void
.end method

.method private final P0()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->x:Lb2/c;

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    const-string v1, "requireActivity(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lb2/c;->m(Landroid/app/Activity;)V

    :cond_10
    return-void
.end method

.method private final Q0()V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f01004a

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    new-instance v1, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$b;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$b;-><init>(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->y:Landroid/view/View;

    if-eqz p0, :cond_1a

    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1a
    return-void
.end method

.method private final R0()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->B:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    const v2, 0x7f0a0513

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    goto :goto_10

    :cond_f
    move-object v0, v1

    :goto_10
    if-eqz v0, :cond_18

    const v2, 0x7f0d00d1

    invoke-virtual {v0, v2}, Landroid/view/ViewStub;->setLayoutResource(I)V

    :cond_18
    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    goto :goto_20

    :cond_1f
    move-object v0, v1

    :goto_20
    iput-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->y:Landroid/view/View;

    if-eqz v0, :cond_2e

    const v2, 0x7f0a00cf

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    goto :goto_2f

    :cond_2e
    move-object v0, v1

    :goto_2f
    if-eqz v0, :cond_39

    new-instance v2, LR6/a;

    invoke-direct {v2, p0}, LR6/a;-><init>(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_39
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->y:Landroid/view/View;

    if-eqz v0, :cond_47

    const v1, 0x7f0a024a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    :cond_47
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x7f010053

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p0

    if-eqz v1, :cond_57

    invoke-virtual {v1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_57
    return-void
.end method

.method private static final S0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->Q0()V

    return-void
.end method

.method private final T0()V
    .registers 4

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1301f7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f1301f6

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, LR6/b;

    invoke-direct {v1, p0}, LR6/b;-><init>(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)V

    const v2, 0x7f1301f5

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, LR6/c;

    invoke-direct {v1, p0}, LR6/c;-><init>(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)V

    const v2, 0x7f1301f8

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->z:Landroid/app/Dialog;

    const/4 v1, 0x1

    if-eqz v0, :cond_3b

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_3b
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->z:Landroid/app/Dialog;

    if-eqz v0, :cond_42

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :cond_42
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->z:Landroid/app/Dialog;

    if-eqz p0, :cond_49

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    :cond_49
    return-void
.end method

.method private static final U0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/content/DialogInterface;I)V
    .registers 3

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->P0()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->z:Landroid/app/Dialog;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_a
    return-void
.end method

.method private static final V0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Landroid/content/DialogInterface;I)V
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->z:Landroid/app/Dialog;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_7
    return-void
.end method

.method private final W0(Z)V
    .registers 3

    const/4 v0, 0x0

    if-eqz p1, :cond_f

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->D:[Ljava/lang/Integer;

    const p1, 0x7f080273

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p0, v0

    return-void

    :cond_f
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->D:[Ljava/lang/Integer;

    const p1, 0x7f080272

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p0, v0

    return-void
.end method


# virtual methods
.method public i0()Ljava/lang/CharSequence;
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x7f130204

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "getString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 2

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 11

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0d0122

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->B:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/android/wallpaper/picker/a;->q0(Landroid/view/View;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, LK1/p;

    invoke-virtual {p2}, Lh3/V;->i()Lg3/v;

    move-result-object v0

    new-instance v2, Landroidx/lifecycle/d0;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v3

    const-string v4, "requireActivity(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "requireContext(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v5, v0}, LK1/p;->i0(Landroid/content/Context;Lg3/v;)Lb2/c$d;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class v0, Lb2/c;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroidx/lifecycle/d0;->a(LC8/c;)Landroidx/lifecycle/a0;

    move-result-object v0

    check-cast v0, Lb2/c;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->x:Lb2/c;

    if-eqz p3, :cond_53

    const-string v0, "show_bauhaus_unlock_view"

    invoke-virtual {p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_54

    :cond_53
    move v0, v1

    :goto_54
    if-nez v0, :cond_65

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->x:Lb2/c;

    if-eqz v0, :cond_62

    invoke-virtual {v0}, Lb2/c;->v()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_62

    goto :goto_63

    :cond_62
    move v2, v1

    :goto_63
    if-eqz v2, :cond_6f

    :cond_65
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->R0()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->x:Lb2/c;

    if-eqz v0, :cond_6f

    invoke-virtual {v0, v1}, Lb2/c;->B(Z)V

    :cond_6f
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->x:Lb2/c;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p1, v0, p0}, LQ6/c;->b(Landroid/view/View;Lb2/c;Landroidx/lifecycle/x;)LY1/c$a;

    move-result-object v1

    invoke-virtual {p0, v1}, LZ1/e;->F0(LY1/c$a;)V

    if-eqz p3, :cond_ea

    invoke-virtual {p0}, LZ1/e;->z0()LY1/c$a;

    move-result-object v1

    if-eqz v1, :cond_89

    invoke-interface {v1, p3}, LY1/c$a;->a(Landroid/os/Bundle;)V

    :cond_89
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    const-string v2, "recorded_app_pid"

    invoke-virtual {p3, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "recorded_color_option"

    const-string v5, ""

    invoke-virtual {p3, v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-eq v2, v1, :cond_ea

    const-string v1, "app was killed and now restarting"

    const-string v2, "NTColorPickerFragment"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_ea

    invoke-virtual {v0}, Lb2/c;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_ea

    const-string p2, "destroy old activity and start new activity"

    invoke-static {v2, p2}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p3

    const-class v0, Lcom/android/wallpaper/picker/CustomizationPickerActivity;

    invoke-virtual {p2, p3, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const p3, 0x8000

    invoke-virtual {p2, p3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string p3, "com.android.wallpaper.LAUNCH_SOURCE"

    const-string v0, "app_launched_launcher"

    invoke-virtual {p2, p3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p3, "destination"

    const-string v0, "color"

    invoke-virtual {p2, p3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-object p1

    :cond_ea
    const p3, 0x7f0a03a2

    invoke-virtual {p1, p3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p3

    const-string v0, "requireViewById(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, LP6/a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->D:[Ljava/lang/Integer;

    invoke-direct {v1, v2, p0, v3}, LP6/a;-><init>(Landroid/app/Activity;Landroidx/lifecycle/x;[Ljava/lang/Integer;)V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->C:LP6/a;

    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$onCreateView$2$1;

    invoke-direct {v2, v1}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$onCreateView$2$1;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v1, Lc2/a;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lc2/a;-><init>(I)V

    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    const/4 v1, -0x1

    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    const p3, 0x7f0a017d

    invoke-virtual {p1, p3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroid/widget/FrameLayout;

    new-instance v0, LF1/e;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v3}, LK1/p;->j0(Landroid/content/Context;)LF1/h;

    move-result-object p2

    invoke-direct {v0, v1, v2, p2}, LF1/e;-><init>(Landroid/content/Context;Landroidx/lifecycle/q;LF1/h;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, LF1/e;->p(Landroid/content/Context;)Lcom/android/customization/picker/mode/DarkModeSectionView;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method

.method public onDestroyView()V
    .registers 2

    invoke-super {p0}, Lcom/android/wallpaper/picker/a;->onDestroyView()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->z:Landroid/app/Dialog;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_a
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->A:Landroid/view/animation/Animation;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    :cond_11
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->y:Landroid/view/View;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->B:Landroid/view/View;

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 6

    const-string v0, "savedInstanceState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LZ1/e;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "recorded_app_pid"

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->x:Lb2/c;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Lb2/c;->t()Ljava/lang/String;

    move-result-object v0

    goto :goto_1b

    :cond_1a
    const/4 v0, 0x0

    :goto_1b
    const-string v1, "recorded_color_option"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->y:Landroid/view/View;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2e

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2e

    move v0, v1

    goto :goto_2f

    :cond_2e
    move v0, v2

    :goto_2f
    const-string v3, "show_bauhaus_unlock_view"

    invoke-virtual {p1, v3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->z:Landroid/app/Dialog;

    if-eqz p0, :cond_3f

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p0

    if-ne p0, v1, :cond_3f

    goto :goto_40

    :cond_3f
    move v1, v2

    :goto_40
    const-string p0, "show_bauhaus_apply_dialog"

    invoke-virtual {p1, p0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 9

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Li3/d;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    if-eqz p2, :cond_11

    const-string p1, "show_bauhaus_apply_dialog"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    goto :goto_12

    :cond_11
    const/4 p1, 0x0

    :goto_12
    if-eqz p1, :cond_17

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->T0()V

    :cond_17
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object p1

    const-string p2, "getViewLifecycleOwner(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v3, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c;-><init>(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method
