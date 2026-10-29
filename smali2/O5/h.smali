.class public final LO5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO5/h;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LO5/h;

    invoke-direct {v0}, LO5/h;-><init>()V

    sput-object v0, LO5/h;->a:LO5/h;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Lh8/o;
    .registers 4

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x2

    new-array p0, p0, [I

    invoke-virtual {p1, p0}, Landroid/view/View;->getLocationOnScreen([I)V

    new-instance p1, Lh8/o;

    const/4 v0, 0x0

    aget v0, p0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aget p0, p0, v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
