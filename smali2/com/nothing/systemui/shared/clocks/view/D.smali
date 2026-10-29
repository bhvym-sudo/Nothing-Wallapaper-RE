.class public abstract Lcom/nothing/systemui/shared/clocks/view/D;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/systemui/shared/clocks/view/D$a;
    }
.end annotation


# static fields
.field public static final K:Lcom/nothing/systemui/shared/clocks/view/D$a;


# instance fields
.field private A:Ljava/util/Locale;

.field private final B:Landroid/os/Handler;

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:F

.field private G:F

.field private H:F

.field private final I:Z

.field private J:Z

.field private final q:Landroid/graphics/PaintFlagsDrawFilter;

.field private final r:Ljava/util/Calendar;

.field private s:Ljava/lang/String;

.field private t:Z

.field private u:Z

.field private v:Ljava/lang/Boolean;

.field private w:LK2/e;

.field private final x:I

.field private y:F

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/systemui/shared/clocks/view/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/systemui/shared/clocks/view/D$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/systemui/shared/clocks/view/D;->K:Lcom/nothing/systemui/shared/clocks/view/D$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance p1, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-direct {p1, p3, p2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->q:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const-string p2, "getInstance(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->r:Ljava/util/Calendar;

    new-instance p1, LK2/e;

    new-instance p2, LK2/c;

    sget-object p4, LK2/a;->v:LK2/a;

    invoke-direct {p2, p4}, LK2/c;-><init>(LK2/a;)V

    const-string p4, "BaseClockView"

    invoke-direct {p1, p2, p4}, LK2/e;-><init>(LK2/f;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    const-string p1, "ro.sf.lcd_density"

    const/16 p2, 0x1a4

    invoke-static {p1, p2}, Landroid/os/SystemProperties;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->x:I

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/high16 p2, 0x3f600000    # 0.875f

    mul-float/2addr p1, p2

    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    const-string p1, ""

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->z:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->A:Ljava/util/Locale;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->B:Landroid/os/Handler;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->C:Z

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->D:Z

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->F:F

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p4, LI2/b;->k:I

    invoke-virtual {p2, p4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iget p4, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    mul-float/2addr p2, p4

    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->G:F

    const-string p2, "customzation.snapshotRatio"

    const/16 p4, 0x19a

    invoke-static {p2, p4}, Landroid/os/SystemProperties;->getInt(Ljava/lang/String;I)I

    move-result p2

    int-to-float p2, p2

    const/high16 p4, 0x447a0000    # 1000.0f

    div-float/2addr p2, p4

    iput p2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->H:F

    const-string p2, "NTF_DYNAMIC_CLOCKFACE_TRANSITION"

    invoke-static {p2}, La6/a;->a(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->I:Z

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->J:Z

    invoke-virtual {p0, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method public static synthetic C(Lcom/nothing/systemui/shared/clocks/view/D;ZLjava/util/Locale;ILjava/lang/Object;)V
    .registers 5

    if-nez p4, :cond_c

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_8

    iget-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->A:Ljava/util/Locale;

    :cond_8
    invoke-virtual {p0, p1, p2}, Lcom/nothing/systemui/shared/clocks/view/D;->B(ZLjava/util/Locale;)V

    return-void

    :cond_c
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: refreshFormat"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final D(LK2/b;)Ljava/lang/String;
    .registers 4

    const-string v0, "$this$d"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LK2/b;->o()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, LK2/b;->n()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "refreshFormat("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final E(LK2/b;)Ljava/lang/String;
    .registers 3

    const-string v0, "$this$d"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LK2/b;->o()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshFormat("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final G(LK2/b;)Ljava/lang/String;
    .registers 3

    const-string v0, "$this$d"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LK2/b;->o()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshTime() - before invalidate new time: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final I()V
    .registers 3

    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->D:Z

    if-eqz v0, :cond_7

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_a

    :cond_7
    const v0, 0x3f333333    # 0.7f

    :goto_a
    iput v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->F:F

    iget v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->x:I

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f600000    # 0.875f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LI2/b;->k:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->G:F

    iget v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->F:F

    mul-float/2addr v1, v0

    iput v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->E:Z

    if-eqz v0, :cond_3b

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->H()V

    :cond_3b
    return-void
.end method

.method public static synthetic a(LK2/b;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->G(LK2/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LK2/b;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->D(LK2/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/nothing/systemui/shared/clocks/view/D;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->s(Lcom/nothing/systemui/shared/clocks/view/D;)V

    return-void
.end method

.method public static synthetic d(LK2/b;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->t(LK2/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LK2/b;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->x(LK2/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LK2/b;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->E(LK2/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LK2/b;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->r(LK2/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final r(LK2/b;)Ljava/lang/String;
    .registers 4

    const-string v0, "$this$d"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LK2/b;->o()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, LK2/b;->n()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConfigurationChanged("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lcom/nothing/systemui/shared/clocks/view/D;)V
    .registers 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/nothing/systemui/shared/clocks/view/D;->C(Lcom/nothing/systemui/shared/clocks/view/D;ZLjava/util/Locale;ILjava/lang/Object;)V

    return-void
.end method

.method private static final t(LK2/b;)Ljava/lang/String;
    .registers 3

    const-string v0, "$this$d"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LK2/b;->o()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDraw("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final x(LK2/b;)Ljava/lang/String;
    .registers 3

    const-string v0, "$this$d"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LK2/b;->o()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onTimeZoneChanged("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected A()V
    .registers 1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->invalidate()V

    return-void
.end method

.method public B(ZLjava/util/Locale;)V
    .registers 10

    const-string v0, "newLocale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "#refreshFormat"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    instance-of v0, p0, Lcom/nothing/systemui/shared/clocks/view/QuickLookClockView;

    const-string v1, "h:mm"

    const-string v2, "HH:mm"

    if-eqz v0, :cond_29

    if-eqz p1, :cond_3e

    :goto_27
    move-object v1, v2

    goto :goto_3e

    :cond_29
    instance-of v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;

    if-eqz v0, :cond_30

    if-eqz p1, :cond_3e

    goto :goto_27

    :cond_30
    instance-of v0, p0, Lcom/nothing/systemui/shared/clocks/view/GraphicClockView;

    if-eqz v0, :cond_37

    const-string v1, "hmmss"

    goto :goto_3e

    :cond_37
    if-eqz p1, :cond_3c

    const-string v1, "HHmm"

    goto :goto_3e

    :cond_3c
    const-string v1, "hmm"

    :cond_3e
    :goto_3e
    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    new-instance v2, Lcom/nothing/systemui/shared/clocks/view/z;

    invoke-direct {v2}, Lcom/nothing/systemui/shared/clocks/view/z;-><init>()V

    sget-object v3, LK2/a;->t:LK2/a;

    invoke-virtual {v0}, LK2/e;->e()LK2/f;

    move-result-object v4

    invoke-virtual {v0}, LK2/e;->f()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v4, v5, v3, v2, v6}, LK2/f;->a(Ljava/lang/String;LK2/a;Lv8/l;Ljava/lang/Throwable;)LK2/b;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, LK2/b;->k(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, LK2/b;->i(Ljava/lang/String;)V

    invoke-virtual {v0}, LK2/e;->e()LK2/f;

    move-result-object p1

    invoke-interface {p1, v2}, LK2/f;->b(LK2/b;)V

    iget-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->s:Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_79

    iget-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->A:Ljava/util/Locale;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9d

    :cond_79
    iget-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    new-instance v0, Lcom/nothing/systemui/shared/clocks/view/A;

    invoke-direct {v0}, Lcom/nothing/systemui/shared/clocks/view/A;-><init>()V

    invoke-virtual {p1}, LK2/e;->e()LK2/f;

    move-result-object v2

    invoke-virtual {p1}, LK2/e;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4, v3, v0, v6}, LK2/f;->a(Ljava/lang/String;LK2/a;Lv8/l;Ljava/lang/Throwable;)LK2/b;

    move-result-object v0

    invoke-interface {v0, v1}, LK2/b;->k(Ljava/lang/String;)V

    invoke-virtual {p1}, LK2/e;->e()LK2/f;

    move-result-object p1

    invoke-interface {p1, v0}, LK2/f;->b(LK2/b;)V

    iput-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->s:Ljava/lang/String;

    iput-object p2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->A:Ljava/util/Locale;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->F()V

    :cond_9d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method public F()V
    .registers 8

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->s:Ljava/lang/String;

    if-nez v0, :cond_5

    goto :goto_66

    :cond_5
    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->r:Ljava/util/Calendar;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->s:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->r:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->z:Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_66

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_66

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    new-instance v2, Lcom/nothing/systemui/shared/clocks/view/B;

    invoke-direct {v2}, Lcom/nothing/systemui/shared/clocks/view/B;-><init>()V

    sget-object v3, LK2/a;->t:LK2/a;

    invoke-virtual {v1}, LK2/e;->e()LK2/f;

    move-result-object v4

    invoke-virtual {v1}, LK2/e;->f()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v4, v5, v3, v2, v6}, LK2/f;->a(Ljava/lang/String;LK2/a;Lv8/l;Ljava/lang/Throwable;)LK2/b;

    move-result-object v2

    invoke-interface {v2, v0}, LK2/b;->k(Ljava/lang/String;)V

    invoke-virtual {v1}, LK2/e;->e()LK2/f;

    move-result-object v1

    invoke-interface {v1, v2}, LK2/f;->b(LK2/b;)V

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->z:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTalkBackContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->invalidate()V

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    const-string v0, "refreshTime() - after invalidate"

    const/4 v1, 0x2

    invoke-static {p0, v0, v6, v1, v6}, LK2/e;->c(LK2/e;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_66
    :goto_66
    return-void
.end method

.method public H()V
    .registers 3

    iget v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->H:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    return-void
.end method

.method protected final getCLOCKFACE_TRANSITION_ENABLED()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->I:Z

    return p0
.end method

.method protected final getCalendar()Ljava/util/Calendar;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->r:Ljava/util/Calendar;

    return-object p0
.end method

.method public getClockHeight()I
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LI2/b;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    mul-float/2addr v0, p0

    float-to-int p0, v0

    return p0
.end method

.method protected final getClockPaddingHorizontal()F
    .registers 2

    iget-boolean v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->E:Z

    if-eqz v0, :cond_a

    iget v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->G:F

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->H:F

    mul-float/2addr v0, p0

    return v0

    :cond_a
    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->G:F

    return p0
.end method

.method protected final getFormat()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->s:Ljava/lang/String;

    return-object p0
.end method

.method protected final getLogger()LK2/e;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    return-object p0
.end method

.method public final getMessageBuffer()LK2/f;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    invoke-virtual {p0}, LK2/e;->e()LK2/f;

    move-result-object p0

    return-object p0
.end method

.method protected final getScaleRatio()F
    .registers 1

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    return p0
.end method

.method protected final getSizeScaleRatio()F
    .registers 1

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->F:F

    return p0
.end method

.method protected final getSnapshotRatio()F
    .registers 1

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->H:F

    return p0
.end method

.method public abstract getTag()Ljava/lang/String;
.end method

.method public final getTalkBackContent()Ljava/lang/String;
    .registers 5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "format(...)"

    if-eqz v0, :cond_23

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v2, "HH:mm"

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->r:Ljava/util/Calendar;

    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_23
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v2, "hh:mm"

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->r:Ljava/util/Calendar;

    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method protected final getTimeStr()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->z:Ljava/lang/String;

    return-object p0
.end method

.method public abstract h(Landroid/graphics/Canvas;)V
.end method

.method protected final i()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->C:Z

    return p0
.end method

.method public invalidate()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "invalidate"

    invoke-static {v0, v3, v1, v2, v1}, LK2/e;->c(LK2/e;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    invoke-super {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method protected final j()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->J:Z

    return p0
.end method

.method protected final k()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->t:Z

    return p0
.end method

.method protected final l()Ljava/lang/Boolean;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->v:Ljava/lang/Boolean;

    return-object p0
.end method

.method protected final m()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->u:Z

    return p0
.end method

.method protected final n()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->E:Z

    return p0
.end method

.method public o(LO2/a;)V
    .registers 2

    const-string p0, "data"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "onAttachedToWindow"

    invoke-static {v0, v3, v1, v2, v1}, LK2/e;->c(LK2/e;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, " onAttachedToWindow:"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "#onAttachedToWindow"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->F()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->A()V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 8

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    new-instance v1, Lcom/nothing/systemui/shared/clocks/view/x;

    invoke-direct {v1}, Lcom/nothing/systemui/shared/clocks/view/x;-><init>()V

    sget-object v2, LK2/a;->t:LK2/a;

    invoke-virtual {v0}, LK2/e;->e()LK2/f;

    move-result-object v3

    invoke-virtual {v0}, LK2/e;->f()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v3, v4, v2, v1, v5}, LK2/f;->a(Ljava/lang/String;LK2/a;Lv8/l;Ljava/lang/Throwable;)LK2/b;

    move-result-object v1

    iget-object v2, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    if-eqz v2, :cond_27

    invoke-virtual {v2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_28

    :cond_27
    move-object v2, v5

    :goto_28
    invoke-interface {v1, v2}, LK2/b;->k(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->A:Ljava/util/Locale;

    if-eqz v2, :cond_33

    invoke-virtual {v2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_33
    invoke-interface {v1, v5}, LK2/b;->i(Ljava/lang/String;)V

    invoke-virtual {v0}, LK2/e;->e()LK2/f;

    move-result-object v0

    invoke-interface {v0, v1}, LK2/f;->b(LK2/b;)V

    iget-object v0, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->A:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_55

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->A:Ljava/util/Locale;

    iget-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->B:Landroid/os/Handler;

    new-instance v0, Lcom/nothing/systemui/shared/clocks/view/y;

    invoke-direct {v0, p0}, Lcom/nothing/systemui/shared/clocks/view/y;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_55
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->invalidate()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "onDetachedFromWindow"

    invoke-static {v0, v3, v1, v2, v1}, LK2/e;->c(LK2/e;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTag()Ljava/lang/String;

    move-result-object p0

    const-string v0, " onDetachedFromWindow"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 8

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "#onDraw"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    new-instance v1, Lcom/nothing/systemui/shared/clocks/view/w;

    invoke-direct {v1}, Lcom/nothing/systemui/shared/clocks/view/w;-><init>()V

    sget-object v2, LK2/a;->t:LK2/a;

    invoke-virtual {v0}, LK2/e;->e()LK2/f;

    move-result-object v3

    invoke-virtual {v0}, LK2/e;->f()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v3, v4, v2, v1, v5}, LK2/f;->a(Ljava/lang/String;LK2/a;Lv8/l;Ljava/lang/Throwable;)LK2/b;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->z:Ljava/lang/String;

    invoke-interface {v1, v2}, LK2/b;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, LK2/e;->e()LK2/f;

    move-result-object v0

    invoke-interface {v0, v1}, LK2/f;->b(LK2/b;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->q:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTag()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->v:Ljava/lang/Boolean;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onDraw:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->h(Landroid/graphics/Canvas;)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    return-void
.end method

.method protected onMeasure(II)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result p2

    invoke-static {p2, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result p1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public p(LX5/a;)V
    .registers 2

    return-void
.end method

.method public q(ZZZ)V
    .registers 4

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->C:Z

    iput-boolean p2, p0, Lcom/nothing/systemui/shared/clocks/view/D;->D:Z

    iput-boolean p3, p0, Lcom/nothing/systemui/shared/clocks/view/D;->J:Z

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->I()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method protected final setClockFaceTransitionEnabled(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->J:Z

    return-void
.end method

.method protected final setDoze(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->t:Z

    return-void
.end method

.method protected final setFormat(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->s:Ljava/lang/String;

    return-void
.end method

.method public setIsSnapshotClockView(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->E:Z

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->I()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method protected final setLogger(LK2/e;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    return-void
.end method

.method public final setMessageBuffer(LK2/f;)V
    .registers 4

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LK2/e;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LK2/e;-><init>(LK2/f;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    return-void
.end method

.method protected final setRegionDark(Ljava/lang/Boolean;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->v:Ljava/lang/Boolean;

    return-void
.end method

.method protected final setScaleRatio(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->y:F

    return-void
.end method

.method protected final setScreenOff(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->u:Z

    return-void
.end method

.method protected final setSizeScaleRatio(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->F:F

    return-void
.end method

.method protected final setSnapshotClockView(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->E:Z

    return-void
.end method

.method protected final setSnapshotRatio(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->H:F

    return-void
.end method

.method protected final setTimeStr(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->z:Ljava/lang/String;

    return-void
.end method

.method public setWindowWidth(I)V
    .registers 2

    return-void
.end method

.method public u()V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->I()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->z()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->invalidate()V

    return-void
.end method

.method public v(LO2/y;)V
    .registers 4

    const-string v0, "theme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LO2/y;->c()Z

    move-result p1

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->v:Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/D;->v:Ljava/lang/Boolean;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->A()V

    :cond_1e
    return-void
.end method

.method public w(Ljava/util/TimeZone;)V
    .registers 8

    const-string v0, "timeZone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->w:LK2/e;

    new-instance v1, Lcom/nothing/systemui/shared/clocks/view/C;

    invoke-direct {v1}, Lcom/nothing/systemui/shared/clocks/view/C;-><init>()V

    sget-object v2, LK2/a;->t:LK2/a;

    invoke-virtual {v0}, LK2/e;->e()LK2/f;

    move-result-object v3

    invoke-virtual {v0}, LK2/e;->f()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v3, v4, v2, v1, v5}, LK2/f;->a(Ljava/lang/String;LK2/a;Lv8/l;Ljava/lang/Throwable;)LK2/b;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, LK2/b;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, LK2/e;->e()LK2/f;

    move-result-object v0

    invoke-interface {v0, v1}, LK2/f;->b(LK2/b;)V

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/D;->r:Ljava/util/Calendar;

    invoke-virtual {p0, p1}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    return-void
.end method

.method public y(LY5/a;)V
    .registers 2

    return-void
.end method

.method public z()V
    .registers 1

    return-void
.end method
