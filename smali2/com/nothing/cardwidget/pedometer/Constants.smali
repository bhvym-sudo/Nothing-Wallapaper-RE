.class public final Lcom/nothing/cardwidget/pedometer/Constants;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/pedometer/Constants;

.field public static final KEY_ANIMATION_FLAG:Ljava/lang/String; = "key_animation_flag"

.field public static final KEY_JUST_WALKING:Ljava/lang/String; = "key_just_walking"

.field public static final KEY_METHOD_NAME:Ljava/lang/String; = "method_page_changed"

.field public static final KEY_PAGE_STATE:Ljava/lang/String; = "key_page_state"

.field public static final KEY_SELECTED_POSITION:Ljava/lang/String; = "key_selected_position"

.field public static final KEY_SEVEN_DAY_AVERAGE:Ljava/lang/String; = "seven_day_average"

.field public static final KEY_SEVEN_DAY_PERCENT:Ljava/lang/String; = "seven_day_percent"

.field public static final KEY_STEPS:Ljava/lang/String; = "steps"

.field public static final KEY_TODAY_PERCENT:Ljava/lang/String; = "today_percent"

.field public static final KEY_WIDGET_ID:Ljava/lang/String; = "key_widget_id"

.field public static final METHOD_ANIMATION_END:Ljava/lang/String; = "method_animation_end"

.field public static final METHOD_PAGE_SELECTED:Ljava/lang/String; = "method_page_selected"

.field public static final MSG_REACH_GOAL_HAS_PERFORMED:I = 0x1

.field public static final MSG_SHOW_NORMAL_INFO:I = 0x1

.field public static final MSG_WALKING_HAS_PERFORMED:I = 0x2

.field public static final PAGE_STATE_NO_ANIM:I = 0x0

.field public static final PAGE_STATE_NO_DATA:I = 0x4

.field public static final PAGE_STATE_NO_PERMISSION:I = 0x3

.field public static final PAGE_STATE_REACH_GOAL_ANIM:I = 0x2

.field public static final PAGE_STATE_REFRESH_HUMAN_PROGRESS:I = 0x5

.field public static final PAGE_STATE_WALKING_ANIM:I = 0x1

.field public static final PEDOMETER_DES_TEXT_SIZE:F = 11.0f

.field public static final PEDOMETER_VALUES_TEXT_SIZE:F = 30.0f

.field public static final PEDOMETER_WIDGET_CONFIGURE_AUTHORITIES:Ljava/lang/String; = "com.nothing.action.PEDOMETER_WIDGET_CONFIGURE"

.field public static final SIZE_HURRY_UP_DESIGN_HEIGHT:F = 28.0f

.field public static final SIZE_NO_PERMISSION_TEXT:F = 20.0f

.field public static final SIZE_REACH_GOAL_DESIGN_WIDTH:F = 96.0f

.field public static final SIZE_WIDGET_DESIGN_WIDTH:F = 172.0f

.field public static final TIME_ANIM_COAST_TIME:J = 0x9f6L


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/pedometer/Constants;

    invoke-direct {v0}, Lcom/nothing/cardwidget/pedometer/Constants;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/pedometer/Constants;->INSTANCE:Lcom/nothing/cardwidget/pedometer/Constants;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
