.class public final Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;
.super Lcom/nothing/systemui/shared/clocks/view/D;
.source "SourceFile"


# instance fields
.field private final L:Ljava/lang/String;

.field private final M:I

.field private N:LX5/a;

.field private O:LY5/a;

.field private P:Ljava/lang/String;

.field private Q:Ljava/lang/String;

.field private final R:Ljava/util/Date;

.field private S:Ljava/lang/String;

.field private final T:Landroid/os/Handler;

.field private U:I

.field private V:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    const-string p1, "OLDQuickLookClockView"

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->L:Ljava/lang/String;

    const/16 p1, 0xc

    .line 5
    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->M:I

    .line 6
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->R:Ljava/util/Date;

    .line 7
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->T:Landroid/os/Handler;

    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->U:I

    .line 9
    iput p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->V:I

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, LI2/f;->p:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->P:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_b

    move p3, v0

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_10

    move p4, v0

    .line 2
    :cond_10
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic J(Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->N(Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;)V

    return-void
.end method

.method private final K(LX5/a;LY5/a;)V
    .registers 13

    const/high16 v0, -0x80000000

    if-eqz p2, :cond_9

    invoke-virtual {p2}, LY5/a;->c()I

    move-result v1

    goto :goto_a

    :cond_9
    move v1, v0

    :goto_a
    const-string v2, ""

    if-eqz p2, :cond_14

    invoke-virtual {p2}, LY5/a;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_15

    :cond_14
    move-object v3, v2

    :cond_15
    sget-object v4, LY5/b;->a:LY5/b;

    const/4 v5, 0x0

    if-eqz p2, :cond_1f

    invoke-virtual {p2}, LY5/a;->a()I

    move-result v6

    goto :goto_20

    :cond_1f
    move v6, v5

    :goto_20
    invoke-virtual {v4, v6}, LY5/b;->a(I)I

    move-result v4

    const/4 v6, 0x1

    if-eqz p2, :cond_29

    move p2, v6

    goto :goto_2a

    :cond_29
    move p2, v5

    :goto_2a
    if-eq v1, v0, :cond_36

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_36

    if-eqz v4, :cond_36

    move v0, v6

    goto :goto_37

    :cond_36
    move v0, v5

    :goto_37
    if-eqz p1, :cond_40

    invoke-virtual {p1}, LX5/a;->h()Z

    move-result v7

    if-eqz v7, :cond_40

    goto :goto_41

    :cond_40
    move v6, v5

    :goto_41
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getTag()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "refreshInfo hasCalendar:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v9, " hasWeather:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v7, 0x8

    if-eqz v6, :cond_f0

    sget p2, LI2/d;->e:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const/4 v0, 0x0

    if-eqz p2, :cond_7b

    if-eqz p1, :cond_77

    invoke-virtual {p1}, LX5/a;->f()Ljava/lang/String;

    move-result-object v1

    goto :goto_78

    :cond_77
    move-object v1, v0

    :goto_78
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7b
    if-eqz p1, :cond_82

    invoke-virtual {p1}, LX5/a;->d()Ljava/lang/String;

    move-result-object p2

    goto :goto_83

    :cond_82
    move-object p2, v0

    :goto_83
    if-eqz p2, :cond_8c

    if-eqz p1, :cond_8d

    invoke-virtual {p1}, LX5/a;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_8d

    :cond_8c
    move-object v0, v2

    :cond_8d
    :goto_8d
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, LX5/b;->d(Landroid/content/Context;LX5/a;)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_b1

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_b1
    sget p2, LI2/d;->c:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_be

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_be
    sget p1, LI2/d;->d:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_c9

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_c9
    sget p1, LI2/d;->r:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_d4

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_d4
    sget p1, LI2/d;->q:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_e1

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_e1
    sget p1, LI2/d;->h:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    if-eqz p1, :cond_19c

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_19c

    :cond_f0
    if-eqz p2, :cond_16c

    if-eqz v0, :cond_13b

    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p2, "\u00b0 "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget p2, LI2/d;->s:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    if-eqz p2, :cond_111

    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_111
    sget p2, LI2/d;->t:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_122

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_122
    sget p1, LI2/d;->r:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_12d

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_12d
    sget p1, LI2/d;->q:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_153

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_153

    :cond_13b
    sget p1, LI2/d;->r:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_146

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_146
    sget p1, LI2/d;->q:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_153

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_153
    :goto_153
    sget p1, LI2/d;->h:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    if-eqz p1, :cond_160

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_160
    sget p1, LI2/d;->d:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_19c

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_19c

    :cond_16c
    sget p1, LI2/d;->q:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_179

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_179
    sget p1, LI2/d;->h:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    if-eqz p1, :cond_186

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_186
    sget p1, LI2/d;->d:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_191

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_191
    sget p1, LI2/d;->r:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_19c

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_19c
    :goto_19c
    sget p1, LI2/d;->e:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_1a9

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    :cond_1a9
    sget p2, LI2/d;->c:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1ba

    invoke-static {}, Le6/a;->e()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    :cond_1ba
    sget v0, LI2/d;->t:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_1cb

    invoke-static {}, Le6/a;->e()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    :cond_1cb
    sget v1, LI2/d;->q:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_1dc

    invoke-static {}, Le6/a;->e()Z

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    :cond_1dc
    sget v2, LI2/d;->i:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_1ed

    invoke-static {}, Le6/a;->e()Z

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    :cond_1ed
    sget v3, LI2/d;->b:I

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_1fe

    invoke-static {}, Le6/a;->e()Z

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    :cond_1fe
    sget v4, LI2/d;->f:I

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_20f

    invoke-static {}, Le6/a;->b()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_20f
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_21e

    invoke-static {}, Le6/a;->d()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_21e
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_22d

    invoke-static {}, Le6/a;->d()Landroid/graphics/Typeface;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_22d
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_23c

    invoke-static {}, Le6/a;->d()Landroid/graphics/Typeface;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_23c
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_24b

    invoke-static {}, Le6/a;->d()Landroid/graphics/Typeface;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_24b
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_25a

    invoke-static {}, Le6/a;->d()Landroid/graphics/Typeface;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_25a
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_269

    invoke-static {}, Le6/a;->d()Landroid/graphics/Typeface;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_269
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->A()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->L()V

    return-void
.end method

.method private static final N(Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;)V
    .registers 5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getFormattedDateLocked()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getTag()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDateInfo: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->Q:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    iput-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->Q:Ljava/lang/String;

    sget v0, LI2/d;->i:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_35

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->Q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_35
    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->N:LX5/a;

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O:LY5/a;

    invoke-direct {p0, v0, v1}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->K(LX5/a;LY5/a;)V

    return-void
.end method

.method private final O(LO2/a;I)Z
    .registers 8

    const/4 p0, 0x0

    if-eqz p1, :cond_26

    invoke-virtual {p1}, LO2/a;->a()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_a

    goto :goto_26

    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    int-to-long v3, p2

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p1}, LO2/a;->a()Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    cmp-long p1, p1, v0

    if-gtz p1, :cond_26

    const/4 p0, 0x1

    :cond_26
    :goto_26
    return p0
.end method


# virtual methods
.method protected A()V
    .registers 6

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->k()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_f

    :cond_d
    const/4 v0, 0x0

    goto :goto_10

    :cond_f
    :goto_f
    const/4 v0, 0x1

    :goto_10
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge v3, v2, :cond_23

    goto :goto_24

    :cond_23
    move v3, v2

    :goto_24
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result v2

    const/4 v4, 0x2

    if-eqz v2, :cond_35

    iget v2, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->U:I

    if-ltz v2, :cond_35

    int-to-float v2, v2

    :goto_30
    int-to-float v3, v4

    mul-float/2addr v1, v3

    sub-float/2addr v2, v1

    float-to-int v1, v2

    goto :goto_37

    :cond_35
    int-to-float v2, v3

    goto :goto_30

    :goto_37
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->y:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float/2addr v2, v3

    sget v3, LI2/d;->g:I

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    if-eqz v3, :cond_5c

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iput v1, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    float-to-int v1, v2

    iput v1, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5c
    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->l()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_73

    if-nez v0, :cond_73

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->m()Z

    move-result v0

    if-nez v0, :cond_73

    const/high16 v0, -0x1000000

    goto :goto_74

    :cond_73
    const/4 v0, -0x1

    :goto_74
    sget v1, LI2/d;->f:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_81

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_81
    sget v1, LI2/d;->i:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_8e

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_8e
    sget v1, LI2/d;->q:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_9b

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_9b
    sget v1, LI2/d;->t:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_a8

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_a8
    sget v1, LI2/d;->e:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_b5

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_b5
    sget v1, LI2/d;->c:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_c2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_c2
    sget v1, LI2/d;->b:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_cf

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_cf
    sget v1, LI2/d;->a:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_e3

    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_e3
    sget v1, LI2/d;->s:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    if-eqz p0, :cond_f7

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v0, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_f7
    return-void
.end method

.method public B(ZLjava/util/Locale;)V
    .registers 4

    const-string v0, "newLocale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/nothing/systemui/shared/clocks/view/D;->B(ZLjava/util/Locale;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->M()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getTag()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->Q:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "refreshFormat: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public F()V
    .registers 3

    invoke-super {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->F()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getTimeStr()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1a

    sget v1, LI2/d;->f:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_1a

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1a
    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->N:LX5/a;

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O:LY5/a;

    invoke-direct {p0, v0, v1}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->K(LX5/a;LY5/a;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->M()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public H()V
    .registers 3

    const-string v0, "customization.old_quick_look"

    const/16 v1, 0x1d6

    invoke-static {v0, v1}, Landroid/os/SystemProperties;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/D;->setSnapshotRatio(F)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getSnapshotRatio()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/nothing/systemui/shared/clocks/view/D;->setScaleRatio(F)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->L()V

    return-void
.end method

.method public final L()V
    .registers 16

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LI2/b;->F:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LI2/b;->E:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, LI2/b;->H:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v3

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, LI2/b;->D:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v4

    mul-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, LI2/b;->A:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v5

    mul-float/2addr v4, v5

    float-to-int v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, LI2/b;->G:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v6

    mul-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, LI2/b;->n:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimension(I)F

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, LI2/b;->z:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v7

    mul-float/2addr v6, v7

    float-to-int v6, v6

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, LI2/b;->x:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v8

    mul-float/2addr v7, v8

    float-to-int v7, v7

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget v9, LI2/b;->B:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v9

    mul-float/2addr v8, v9

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    sget v10, LI2/b;->C:I

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v9

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result v10

    mul-float/2addr v9, v10

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getClockPaddingHorizontal()F

    sget v10, LI2/d;->f:I

    invoke-virtual {p0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    const/4 v12, 0x0

    if-eqz v11, :cond_bb

    invoke-virtual {v11, v12, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_bb
    invoke-virtual {p0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    const-string v11, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    if-eqz v10, :cond_f3

    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    invoke-static {v13, v11}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x2

    iput v14, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    float-to-int v8, v8

    iput v8, v13, Landroid/widget/LinearLayout$LayoutParams;->height:I

    iget-object v8, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O:LY5/a;

    if-nez v8, :cond_e9

    iget-object v8, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->N:LX5/a;

    if-eqz v8, :cond_e6

    invoke-static {v8}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v8}, LX5/a;->h()Z

    move-result v8

    if-eqz v8, :cond_e6

    goto :goto_e9

    :cond_e6
    iput v2, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    goto :goto_eb

    :cond_e9
    :goto_e9
    iput v1, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    :goto_eb
    iput v3, v13, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v10, v12, v0, v12, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v10, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_f3
    sget v0, LI2/d;->q:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_100

    invoke-virtual {v1, v12, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_100
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_116

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_116
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_121

    invoke-virtual {v0, v12, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_121
    sget v0, LI2/d;->h:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_139

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_139
    sget v0, LI2/d;->i:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_146

    invoke-virtual {v1, v12, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_146
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_15d

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_15d
    sget v0, LI2/d;->b:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_16a

    invoke-virtual {v0, v12, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_16a
    sget v0, LI2/d;->a:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_187

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    iput v7, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iput v7, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_187
    sget v0, LI2/d;->s:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_1a4

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    iput v6, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iput v6, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1a4
    sget v0, LI2/d;->t:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1b1

    invoke-virtual {v0, v12, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1b1
    sget v0, LI2/d;->e:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_1be

    invoke-virtual {v1, v12, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1be
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1d4

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1d4
    sget v0, LI2/d;->c:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    if-eqz p0, :cond_1e1

    invoke-virtual {p0, v12, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1e1
    return-void
.end method

.method protected final M()V
    .registers 5

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->T:Landroid/os/Handler;

    new-instance v1, Lcom/nothing/systemui/shared/clocks/view/O;

    invoke-direct {v1, p0}, Lcom/nothing/systemui/shared/clocks/view/O;-><init>(Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final getALARM_VISIBILITY_HOURS()I
    .registers 1

    iget p0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->M:I

    return p0
.end method

.method public getClockHeight()I
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LI2/b;->y:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->getScaleRatio()F

    move-result p0

    mul-float/2addr v0, p0

    float-to-int p0, v0

    return p0
.end method

.method protected final getFormattedDateLocked()Ljava/lang/String;
    .registers 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getTag()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getFormattedDateLocked:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->P:Ljava/lang/String;

    invoke-static {v1, v0}, Landroid/icu/text/DateFormat;->getInstanceForSkeleton(Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;

    move-result-object v0

    sget-object v1, Landroid/icu/text/DisplayContext;->CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE:Landroid/icu/text/DisplayContext;

    invoke-virtual {v0, v1}, Landroid/icu/text/DateFormat;->setContext(Landroid/icu/text/DisplayContext;)V

    iget-object v1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->R:Ljava/util/Date;

    if-eqz v1, :cond_32

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/Date;->setTime(J)V

    :cond_32
    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->R:Ljava/util/Date;

    invoke-virtual {v0, p0}, Landroid/icu/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getTag()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->L:Ljava/lang/String;

    return-object p0
.end method

.method public h(Landroid/graphics/Canvas;)V
    .registers 2

    const-string p0, "canvas"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public o(LO2/a;)V
    .registers 7

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->o(LO2/a;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->M:I

    invoke-direct {p0, p1, v1}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O(LO2/a;I)Z

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " onAlarmDataChanged:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " withinNHoursLocked:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " parent:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->M:I

    invoke-direct {p0, p1, v0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O(LO2/a;I)Z

    move-result v0

    if-eqz v0, :cond_67

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4f

    const-string v0, "HH:mm"

    goto :goto_51

    :cond_4f
    const-string v0, "h:mm"

    :goto_51
    invoke-virtual {p1}, LO2/a;->a()Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->S:Ljava/lang/String;

    goto :goto_6b

    :cond_67
    const-string p1, ""

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->S:Ljava/lang/String;

    :goto_6b
    iget-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->S:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_90

    sget p1, LI2/d;->a:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const/16 v0, 0x8

    if-eqz p1, :cond_82

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_82
    sget p1, LI2/d;->b:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_ab

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_ab

    :cond_90
    sget p1, LI2/d;->a:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const/4 v0, 0x0

    if-eqz p1, :cond_9e

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_9e
    sget p1, LI2/d;->b:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_ab

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_ab
    :goto_ab
    sget p1, LI2/d;->b:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_ba

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->S:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_ba
    iget-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->N:LX5/a;

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O:LY5/a;

    invoke-direct {p0, p1, v0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->K(LX5/a;LY5/a;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 3

    invoke-super {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, " onAttachedToWindow:"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->L()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2a

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr p2, p3

    div-int/lit8 p2, p2, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    sub-int/2addr p0, p3

    div-int/lit8 p0, p0, 0x2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    add-int/2addr p4, p0

    invoke-virtual {p1, p2, p0, p3, p4}, Landroid/view/View;->layout(IIII)V

    :cond_2a
    return-void
.end method

.method protected onMeasure(II)V
    .registers 5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->n()Z

    move-result v0

    if-eqz v0, :cond_1f

    iget v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->U:I

    if-ltz v0, :cond_e

    iget v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->V:I

    if-gez v0, :cond_1f

    :cond_e
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->U:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->V:I

    iget v1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->U:I

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    :cond_1f
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->measureChildren(II)V

    invoke-super {p0, p1, p2}, Lcom/nothing/systemui/shared/clocks/view/D;->onMeasure(II)V

    return-void
.end method

.method public p(LX5/a;)V
    .registers 5

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCalendarDataChanged: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->N:LX5/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->N:LX5/a;

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O:LY5/a;

    invoke-direct {p0, p1, v0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->K(LX5/a;LY5/a;)V

    :cond_27
    return-void
.end method

.method public w(Ljava/util/TimeZone;)V
    .registers 3

    const-string v0, "timeZone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->w(Ljava/util/TimeZone;)V

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->M()V

    return-void
.end method

.method public y(LY5/a;)V
    .registers 6

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O:LY5/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    iput-object p1, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->O:LY5/a;

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onWeatherDataChanged:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " parent:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->N:LX5/a;

    invoke-direct {p0, v0, p1}, Lcom/nothing/systemui/shared/clocks/view/OldQuickLookClockView;->K(LX5/a;LY5/a;)V

    :cond_33
    return-void
.end method
