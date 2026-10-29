.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$a;,
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$b;
    }
.end annotation


# static fields
.field public static final O:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$a;


# instance fields
.field private final A:F

.field private final B:F

.field private final C:F

.field private final D:Landroid/graphics/drawable/Drawable;

.field private final E:Landroid/graphics/Rect;

.field private F:F

.field private G:F

.field private H:F

.field private I:I

.field private final J:Lh8/h;

.field private final K:Ljava/lang/Runnable;

.field private final L:Landroid/graphics/Paint;

.field private final M:Landroid/content/BroadcastReceiver;

.field private final N:LF8/L;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Landroid/app/AlarmManager$AlarmClockInfo;

.field private u:Z

.field private v:Ljava/lang/String;

.field private w:Ljava/util/Calendar;

.field private x:Ljava/text/SimpleDateFormat;

.field private final y:Lh8/h;

.field private z:Landroid/database/ContentObserver;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->O:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    const-string p2, ""

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->q:Ljava/lang/String;

    .line 5
    const-string p2, " "

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->r:Ljava/lang/String;

    .line 6
    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/V;

    invoke-direct {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/V;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->y:Lh8/h;

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f0705fe

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->A:F

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f0705fc

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->B:F

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f0700b6

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->C:F

    const p2, 0x7f08010b

    .line 10
    invoke-static {p1, p2}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->D:Landroid/graphics/drawable/Drawable;

    .line 11
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    const/4 v0, 0x0

    if-nez p2, :cond_54

    goto :goto_64

    .line 12
    :cond_54
    iput v0, p3, Landroid/graphics/Rect;->left:I

    .line 13
    iput v0, p3, Landroid/graphics/Rect;->top:I

    .line 14
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p3, Landroid/graphics/Rect;->right:I

    .line 15
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p3, Landroid/graphics/Rect;->bottom:I

    .line 16
    :goto_64
    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E:Landroid/graphics/Rect;

    const/16 p3, 0xff

    .line 17
    iput p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->I:I

    .line 18
    new-instance p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/W;

    invoke-direct {p3, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/W;-><init>(Landroid/content/Context;)V

    invoke-static {p3}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p3

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->J:Lh8/h;

    .line 19
    new-instance p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/X;

    invoke-direct {p3, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/X;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->K:Ljava/lang/Runnable;

    .line 20
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    .line 21
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    sget-object v1, LF2/F;->t:LF2/F$a;

    invoke-virtual {v1, p1}, LF2/F$a;->a(Landroid/content/Context;)LF2/F;

    move-result-object v1

    invoke-virtual {v1}, LF2/F;->Y()Z

    move-result v1

    if-eqz v1, :cond_95

    const v1, 0x106001d

    goto :goto_98

    :cond_95
    const v1, 0x1060028

    .line 23
    :goto_98
    invoke-static {p1, v1}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    const/16 v1, 0x1c2

    invoke-static {p1, v1, v0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0705fd

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    .line 27
    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->M:Landroid/content/BroadcastReceiver;

    .line 28
    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p1

    invoke-static {p1}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->N:LF8/L;

    if-eqz p2, :cond_d4

    .line 29
    invoke-virtual {p3}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 30
    :cond_d4
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->v:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->n(Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E()V

    .line 32
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->q()V

    .line 33
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->p()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 2
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->x()V

    return-void
.end method

.method private final E()V
    .registers 5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "HH:mm"

    goto :goto_f

    :cond_d
    const-string v0, "h:mm"

    :goto_f
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LH6/a;->a(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->x:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method private final F(J)Z
    .registers 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object p0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xc

    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    cmp-long p0, p1, v0

    if-gtz p0, :cond_13

    const/4 p0, 0x1

    return p0

    :cond_13
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic a(Landroid/content/Context;)Ljava/text/SimpleDateFormat;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->o(Landroid/content/Context;)Ljava/text/SimpleDateFormat;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    return-void
.end method

.method public static synthetic c(Landroid/content/Context;)Landroid/app/AlarmManager;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->m(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->n(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)Landroid/app/AlarmManager;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->getAlarmManager()Landroid/app/AlarmManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->v:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic g(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)Ljava/lang/Runnable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->K:Ljava/lang/Runnable;

    return-object p0
.end method

.method private final getAlarmManager()Landroid/app/AlarmManager;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->J:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AlarmManager;

    return-object p0
.end method

.method private final getDateSimpleFormat()Ljava/text/SimpleDateFormat;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->y:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/text/SimpleDateFormat;

    return-object p0
.end method

.method public static final synthetic h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->p()V

    return-void
.end method

.method public static final synthetic i(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->q()V

    return-void
.end method

.method public static final synthetic j(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Landroid/app/AlarmManager$AlarmClockInfo;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->t:Landroid/app/AlarmManager$AlarmClockInfo;

    return-void
.end method

.method public static final synthetic k(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->x()V

    return-void
.end method

.method public static final synthetic l(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E()V

    return-void
.end method

.method private static final m(Landroid/content/Context;)Landroid/app/AlarmManager;
    .registers 2

    const-class v0, Landroid/app/AlarmManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AlarmManager;

    return-object p0
.end method

.method private final n(Ljava/lang/String;)V
    .registers 2

    if-eqz p1, :cond_b

    invoke-static {p1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object p1

    goto :goto_f

    :cond_b
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    :goto_f
    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->w:Ljava/util/Calendar;

    return-void
.end method

.method private static final o(Landroid/content/Context;)Ljava/text/SimpleDateFormat;
    .registers 3

    invoke-static {p0}, LH6/a;->a(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object p0

    const-string v0, "E, d MMM"

    invoke-static {p0, v0}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, v0, p0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v1
.end method

.method private final p()V
    .registers 8

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->K:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->N:LF8/L;

    new-instance v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final q()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->w:Ljava/util/Calendar;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->x:Ljava/text/SimpleDateFormat;

    if-nez v1, :cond_16

    const-string v1, "timeSimpleFormat"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_16
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->q:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->getDateSimpleFormat()Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->r:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final r()V
    .registers 5

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->u:Z

    if-eqz v0, :cond_2b

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->z:Landroid/database/ContentObserver;

    if-nez v0, :cond_13

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$b;

    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->z:Landroid/database/ContentObserver;

    :cond_13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "time_12_24"

    invoke-static {v1}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->z:Landroid/database/ContentObserver;

    invoke-static {}, Landroid/os/UserHandle;->myUserId()I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, p0, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;I)V

    :cond_2b
    return-void
.end method

.method private final s()V
    .registers 3

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.app.action.NEXT_ALARM_CLOCK_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->M:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private final v()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->z:Landroid/database/ContentObserver;

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    :cond_f
    return-void
.end method

.method private final w()V
    .registers 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->M:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method private final x()V
    .registers 6

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->w:Ljava/util/Calendar;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->t:Landroid/app/AlarmManager$AlarmClockInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_3a

    invoke-virtual {v1}, Landroid/app/AlarmManager$AlarmClockInfo;->getTriggerTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->F(J)Z

    move-result v3

    if-eqz v3, :cond_1d

    goto :goto_1e

    :cond_1d
    move-object v1, v2

    :goto_1e
    if-eqz v1, :cond_3a

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->x:Ljava/text/SimpleDateFormat;

    if-nez v1, :cond_31

    const-string v1, "timeSimpleFormat"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_32

    :cond_31
    move-object v2, v1

    :goto_32
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    :cond_3a
    iput-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->s:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public final A(LO1/b;Z)V
    .registers 6

    const-string v0, "snapshotModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    if-nez p2, :cond_17

    invoke-virtual {p1}, LO1/b;->d()LA7/a;

    move-result-object p2

    sget-object v2, LA7/a;->r:LA7/a;

    if-ne p2, v2, :cond_14

    move p2, v1

    goto :goto_15

    :cond_14
    move p2, v0

    :goto_15
    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->G:F

    :cond_17
    invoke-virtual {p1}, LO1/b;->e()Ljava/lang/String;

    move-result-object p1

    const-string p2, "OLD_QUICKLOOK"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_24

    move v0, v1

    :cond_24
    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->H:F

    iget p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->F:F

    cmpl-float p1, p1, v1

    const/16 p2, 0xff

    if-lez p1, :cond_2f

    goto :goto_35

    :cond_2f
    int-to-float p1, p2

    mul-float/2addr v0, p1

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result p2

    :goto_35
    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final B(F)V
    .registers 4

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->F:F

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->H:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/16 v1, 0xff

    if-lez v0, :cond_c

    goto :goto_12

    :cond_c
    int-to-float v0, v1

    mul-float/2addr p1, v0

    invoke-static {p1}, Lx8/a;->b(F)I

    move-result v1

    :goto_12
    iput v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final C(F)V
    .registers 2

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->B(F)V

    return-void
.end method

.method public final getRealHeight()I
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p0

    iget v0, p0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget p0, p0, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, p0

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result p0

    return p0
.end method

.method protected onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->u:Z

    if-nez v0, :cond_15

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->u:Z

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->s()V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->r()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->v:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->n(Ljava/lang/String;)V

    :cond_15
    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 3

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->u:Z

    if-eqz v0, :cond_10

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->w()V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->v()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->u:Z

    :cond_10
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->K:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->N:LF8/L;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, LF8/M;->d(LF8/L;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "canvas"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->s:Ljava/lang/String;

    const/4 v3, 0x1

    if-eqz v2, :cond_1a

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_18

    goto :goto_1a

    :cond_18
    const/4 v2, 0x0

    goto :goto_1b

    :cond_1a
    :goto_1a
    move v2, v3

    :goto_1b
    iget-object v4, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    iget-object v5, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->q:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    iget v5, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->A:F

    add-float/2addr v5, v4

    iget-object v6, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    iget-object v7, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->r:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    if-nez v2, :cond_39

    iget-object v8, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    iget-object v9, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->s:Ljava/lang/String;

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v8

    goto :goto_3a

    :cond_39
    const/4 v8, 0x0

    :goto_3a
    const/4 v9, 0x2

    if-nez v2, :cond_4b

    iget-object v10, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E:Landroid/graphics/Rect;

    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v10

    int-to-float v10, v10

    add-float/2addr v10, v8

    iget v11, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->B:F

    int-to-float v12, v9

    mul-float/2addr v11, v12

    add-float/2addr v10, v11

    goto :goto_4c

    :cond_4b
    const/4 v10, 0x0

    :goto_4c
    add-float v11, v5, v6

    add-float/2addr v11, v10

    int-to-float v10, v9

    div-float/2addr v11, v10

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v12

    div-int/2addr v12, v9

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    const-string v14, "getContext(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13}, LH6/a;->d(Landroid/content/Context;)Z

    move-result v13

    if-eqz v13, :cond_69

    int-to-float v13, v12

    add-float/2addr v13, v11

    sub-float/2addr v13, v4

    goto :goto_6c

    :cond_69
    int-to-float v4, v12

    sub-float v13, v4, v11

    :goto_6c
    iget-object v4, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->ascent()F

    move-result v4

    iget-object v15, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    invoke-virtual {v15}, Landroid/graphics/Paint;->descent()F

    move-result v15

    add-float/2addr v4, v15

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    div-float/2addr v4, v10

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    div-int/2addr v15, v9

    int-to-float v15, v15

    add-float/2addr v4, v15

    int-to-float v12, v12

    sub-float/2addr v12, v11

    div-float v10, v5, v10

    add-float/2addr v12, v10

    iget v11, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->C:F

    sub-float/2addr v12, v11

    iget v11, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->G:F

    mul-float/2addr v12, v11

    int-to-float v3, v3

    iget v11, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->F:F

    sub-float v15, v3, v11

    mul-float/2addr v12, v15

    sub-float v11, v3, v11

    mul-float/2addr v10, v11

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11, v14}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, LH6/a;->d(Landroid/content/Context;)Z

    move-result v11

    if-eqz v11, :cond_aa

    sub-float v11, v13, v10

    add-float/2addr v11, v12

    goto :goto_ad

    :cond_aa
    add-float v11, v13, v10

    sub-float/2addr v11, v12

    :goto_ad
    iget v15, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->F:F

    sub-float v15, v3, v15

    const/16 v16, 0x0

    const/high16 v7, 0x3f400000    # 0.75f

    invoke-static {v15, v7}, Ljava/lang/Math;->min(FF)F

    move-result v15

    div-float/2addr v15, v7

    sub-float/2addr v3, v15

    iget-object v7, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    const/16 v15, 0xff

    int-to-float v15, v15

    mul-float/2addr v3, v15

    invoke-static {v3}, Lx8/a;->b(F)I

    move-result v3

    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->q:Ljava/lang/String;

    iget-object v7, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    invoke-virtual {v1, v3, v11, v4, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LH6/a;->d(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_e3

    sub-float/2addr v13, v6

    iget v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->A:F

    sub-float/2addr v13, v3

    add-float/2addr v13, v10

    add-float/2addr v13, v12

    goto :goto_e6

    :cond_e3
    add-float/2addr v13, v5

    sub-float/2addr v13, v10

    sub-float/2addr v13, v12

    :goto_e6
    iget-object v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    iget v5, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->I:I

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->r:Ljava/lang/String;

    iget-object v5, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    invoke-virtual {v1, v3, v13, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    if-nez v2, :cond_167

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LH6/a;->d(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_10f

    iget v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->B:F

    sub-float/2addr v13, v2

    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v13, v2

    goto :goto_113

    :cond_10f
    add-float/2addr v13, v6

    iget v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->B:F

    add-float/2addr v13, v2

    :goto_113
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    div-int/2addr v2, v9

    iget-object v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    div-int/2addr v3, v9

    sub-int/2addr v2, v3

    sub-int/2addr v2, v9

    iget-object v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E:Landroid/graphics/Rect;

    float-to-int v5, v13

    invoke-virtual {v3, v5, v2}, Landroid/graphics/Rect;->offsetTo(II)V

    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->D:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_130

    iget v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->I:I

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_130
    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->D:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_139

    iget-object v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_139
    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->D:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_140

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_140
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LH6/a;->d(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_152

    iget v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->B:F

    sub-float/2addr v13, v2

    sub-float/2addr v13, v8

    goto :goto_15d

    :cond_152
    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->E:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v13, v2

    iget v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->B:F

    add-float/2addr v13, v2

    :goto_15d
    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->s:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->L:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v13, v4, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_167
    iget v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->F:F

    cmpl-float v1, v1, v16

    if-lez v1, :cond_18b

    iget-object v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->q:Ljava/lang/String;

    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->r:Ljava/lang/String;

    iget-object v3, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->s:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_19e

    :cond_18b
    iget-object v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->r:Ljava/lang/String;

    iget-object v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->s:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_19e
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final t(F)V
    .registers 2

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->G:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final u(IIF)V
    .registers 10

    sget-object v0, LA7/d;->a:LA7/d;

    invoke-virtual {v0, p1}, LA7/d;->k(I)Z

    move-result v1

    invoke-virtual {v0, p2}, LA7/d;->k(I)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_10

    if-eqz v2, :cond_29

    :cond_10
    cmpl-float v5, p3, v4

    if-lez v5, :cond_26

    if-eqz v2, :cond_18

    if-lt p1, p2, :cond_1c

    :cond_18
    if-eqz v1, :cond_1e

    if-le p1, p2, :cond_1e

    :cond_1c
    move v1, p3

    goto :goto_20

    :cond_1e
    int-to-float v1, v3

    sub-float/2addr v1, p3

    :goto_20
    iput v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->G:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_29

    :cond_26
    invoke-virtual {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->z(I)V

    :cond_29
    :goto_29
    invoke-virtual {v0, p1}, LA7/d;->j(I)Z

    move-result v1

    invoke-virtual {v0, p2}, LA7/d;->j(I)Z

    move-result v0

    if-nez v1, :cond_37

    if-eqz v0, :cond_36

    goto :goto_37

    :cond_36
    return-void

    :cond_37
    :goto_37
    cmpl-float v2, p3, v4

    if-lez v2, :cond_56

    if-eqz v0, :cond_3f

    if-lt p1, p2, :cond_43

    :cond_3f
    if-eqz v1, :cond_46

    if-le p1, p2, :cond_46

    :cond_43
    int-to-float p1, v3

    sub-float p3, p1, p3

    :cond_46
    iput p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->H:F

    const/16 p1, 0xff

    int-to-float p1, p1

    mul-float/2addr p3, p1

    invoke-static {p3}, Lx8/a;->b(F)I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_56
    invoke-virtual {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->z(I)V

    return-void
.end method

.method public final y(Ljava/lang/String;)V
    .registers 3

    const-string v0, "selectId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LA7/d;->a:LA7/d;

    invoke-virtual {v0, p1}, LA7/d;->e(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->z(I)V

    return-void
.end method

.method public final z(I)V
    .registers 6

    sget-object v0, LA7/d;->a:LA7/d;

    invoke-virtual {v0, p1}, LA7/d;->k(I)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    if-eqz v1, :cond_d

    move v1, v2

    goto :goto_e

    :cond_d
    move v1, v3

    :goto_e
    iput v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->G:F

    invoke-virtual {v0, p1}, LA7/d;->j(I)Z

    move-result p1

    if-eqz p1, :cond_17

    move v2, v3

    :cond_17
    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->H:F

    iget p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->F:F

    cmpl-float p1, p1, v3

    const/16 v0, 0xff

    if-lez p1, :cond_22

    goto :goto_28

    :cond_22
    int-to-float p1, v0

    mul-float/2addr v2, p1

    invoke-static {v2}, Lx8/a;->b(F)I

    move-result v0

    :goto_28
    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
