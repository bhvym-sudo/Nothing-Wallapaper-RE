.class public final Lj8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lj8/d$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lj8/d$a;I)I
    .registers 2

    invoke-direct {p0, p1}, Lj8/d$a;->c(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lj8/d$a;I)I
    .registers 2

    invoke-direct {p0, p1}, Lj8/d$a;->d(I)I

    move-result p0

    return p0
.end method

.method private final c(I)I
    .registers 2

    const/4 p0, 0x1

    invoke-static {p1, p0}, LB8/h;->f(II)I

    move-result p0

    mul-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p0

    return p0
.end method

.method private final d(I)I
    .registers 2

    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public final e()Lj8/d;
    .registers 1

    invoke-static {}, Lj8/d;->b()Lj8/d;

    move-result-object p0

    return-object p0
.end method
