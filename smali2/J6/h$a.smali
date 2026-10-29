.class public final LJ6/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ6/h;
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
    invoke-direct {p0}, LJ6/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .registers 1

    invoke-static {}, LJ6/h;->t()Z

    move-result p0

    return p0
.end method

.method public final b(Z)V
    .registers 2

    invoke-static {p1}, LJ6/h;->u(Z)V

    return-void
.end method
