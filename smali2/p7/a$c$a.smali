.class public final Lp7/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/a$c;
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
    invoke-direct {p0}, Lp7/a$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lp7/a$c;
    .registers 1

    invoke-static {}, Lp7/a$c;->a()Lp7/a$c;

    move-result-object p0

    return-object p0
.end method

.method public final b()Lp7/a$c;
    .registers 1

    invoke-static {}, Lp7/a$c;->b()Lp7/a$c;

    move-result-object p0

    return-object p0
.end method
