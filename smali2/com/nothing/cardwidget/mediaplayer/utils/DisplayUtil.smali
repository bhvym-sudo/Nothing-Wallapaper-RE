.class public final Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

.field public static final MARGIN_BOTTOM:Ljava/lang/String; = "layout_marginBottom"

.field public static final MARGIN_END:Ljava/lang/String; = "layout_marginEnd"

.field public static final MARGIN_LEFT:Ljava/lang/String; = "layout_marginLeft"

.field public static final MARGIN_RIGHT:Ljava/lang/String; = "layout_marginRight"

.field public static final MARGIN_START:Ljava/lang/String; = "layout_marginStart"

.field public static final MARGIN_TOP:Ljava/lang/String; = "layout_marginTop"

.field private static final TAG:Ljava/lang/String; = "DisplayUtil"


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    invoke-direct {v0}, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;->INSTANCE:Lcom/nothing/cardwidget/mediaplayer/utils/DisplayUtil;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final setViewMargin(Landroid/view/View;Ljava/lang/String;I)V
    .registers 5

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "key"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_78

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_7a

    goto :goto_75

    :sswitch_1a
    const-string v0, "layout_marginStart"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_23

    goto :goto_75

    :cond_23
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    goto :goto_75

    :sswitch_2a
    const-string v0, "layout_marginRight"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_33

    goto :goto_75

    :cond_33
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_75

    :sswitch_39
    const-string v0, "layout_marginLeft"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_42

    goto :goto_75

    :cond_42
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_75

    :sswitch_48
    const-string v0, "layout_marginBottom"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_51

    goto :goto_75

    :cond_51
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_75

    :sswitch_57
    const-string v0, "layout_marginTop"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_60

    goto :goto_75

    :cond_60
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_75

    :sswitch_66
    const-string v0, "layout_marginEnd"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6f

    goto :goto_75

    :cond_6f
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    :goto_75
    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_78
    return-void

    nop

    :sswitch_data_7a
    .sparse-switch
        -0x38e2f288 -> :sswitch_66
        -0x38e2ba0e -> :sswitch_57
        0x8daf46e -> :sswitch_48
        0x1c87af0a -> :sswitch_39
        0x74c49379 -> :sswitch_2a
        0x74d795bf -> :sswitch_1a
    .end sparse-switch
.end method

.method public final setViewPadding(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .registers 6

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_10

    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result p0

    :goto_10
    if-eqz p3, :cond_17

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1b

    :cond_17
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    :goto_1b
    if-eqz p4, :cond_22

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_26

    :cond_22
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    :goto_26
    if-eqz p5, :cond_2d

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p4

    goto :goto_31

    :cond_2d
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result p4

    :goto_31
    invoke-virtual {p1, p0, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public final setViewSize(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .registers 4

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    if-eqz p0, :cond_1e

    if-eqz p2, :cond_13

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iput p2, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_13
    if-eqz p3, :cond_1b

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    iput p2, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_1b
    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1e
    return-void
.end method
