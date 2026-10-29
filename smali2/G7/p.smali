.class public final LG7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG7/p;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LG7/p;

    invoke-direct {v0}, LG7/p;-><init>()V

    sput-object v0, LG7/p;->a:LG7/p;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Le3/g;LJ7/i;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, LG7/p;->c(Le3/g;LJ7/i;Landroid/view/View;)V

    return-void
.end method

.method private static final c(Le3/g;LJ7/i;Landroid/view/View;)V
    .registers 3

    iget-object p0, p0, Le3/g;->F:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {p1}, LJ7/i;->n0()Z

    move-result p2

    if-nez p2, :cond_19

    invoke-virtual {p0}, Lcom/nothing/widget/ui/NtSwitch;->toggle()V

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    if-eqz p0, :cond_14

    sget-object p0, LA7/g;->q:LA7/g;

    goto :goto_16

    :cond_14
    sget-object p0, LA7/g;->r:LA7/g;

    :goto_16
    invoke-virtual {p1, p0}, LJ7/i;->T0(LA7/g;)V

    :cond_19
    return-void
.end method


# virtual methods
.method public final b(Le3/g;LJ7/i;Ly7/s;LF8/L;)V
    .registers 12

    const-string p0, "binding"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "lockScreenViewModel"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "clockPickerListener"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "coroutineScope"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p1, Le3/g;->K:Landroid/widget/LinearLayout;

    new-instance v0, LG7/o;

    invoke-direct {v0, p1, p2}, LG7/o;-><init>(Le3/g;LJ7/i;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v4, LG7/p$a;

    const/4 p0, 0x0

    invoke-direct {v4, p2, p1, p3, p0}, LG7/p$a;-><init>(LJ7/i;Le3/g;Ly7/s;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p4

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final d(Landroid/view/View;Z)Landroid/animation/ObjectAnimator;
    .registers 7

    const-string p0, "unlockAnimation"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result v0

    if-eqz p2, :cond_10

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_11

    :cond_10
    const/4 v1, 0x0

    :goto_11
    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v0, 0x1

    aput v1, v2, v0

    invoke-static {p1, p0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    if-nez p2, :cond_28

    new-instance p2, LG7/p$b;

    invoke-direct {p2, p1}, LG7/p$b;-><init>(Landroid/view/View;)V

    invoke-virtual {p0, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_28
    const-string p1, "also(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
