.class public final LB8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/e;
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
    invoke-direct {p0}, LB8/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)LB8/e;
    .registers 4

    new-instance p0, LB8/e;

    invoke-direct {p0, p1, p2, p3}, LB8/e;-><init>(III)V

    return-object p0
.end method
