.class public final LU6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU6/e;
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
    invoke-direct {p0}, LU6/e$a;-><init>()V

    return-void
.end method

.method private final a()LU6/e;
    .registers 1

    invoke-static {}, LU6/e;->c()Lh8/h;

    move-result-object p0

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LU6/e;

    return-object p0
.end method


# virtual methods
.method public final b()LU6/e;
    .registers 1

    invoke-direct {p0}, LU6/e$a;->a()LU6/e;

    move-result-object p0

    return-object p0
.end method
