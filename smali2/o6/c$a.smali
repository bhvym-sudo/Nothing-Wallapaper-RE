.class public final Lo6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/c;
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
    invoke-direct {p0}, Lo6/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lo6/c;
    .registers 2

    new-instance p0, Lo6/c;

    invoke-direct {p0}, Lo6/c;-><init>()V

    invoke-virtual {p0, p1}, Lo6/c;->c(I)Lo6/c;

    move-result-object p0

    return-object p0
.end method
