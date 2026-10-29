.class public final LW6/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW6/i;
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
    invoke-direct {p0}, LW6/i$a;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()J
    .registers 3

    invoke-static {}, LW6/i;->g0()J

    move-result-wide v0

    return-wide v0
.end method

.method protected final b()J
    .registers 3

    invoke-static {}, LW6/i;->h0()J

    move-result-wide v0

    return-wide v0
.end method

.method protected final c()F
    .registers 1

    invoke-static {}, LW6/i;->i0()F

    move-result p0

    return p0
.end method

.method protected final d()F
    .registers 1

    invoke-static {}, LW6/i;->j0()F

    move-result p0

    return p0
.end method
