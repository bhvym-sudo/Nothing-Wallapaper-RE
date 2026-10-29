.class public final Lcom/nothing/security/sdk/SecurityConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/security/sdk/SecurityConfig$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/security/sdk/SecurityConfig$a;


# instance fields
.field private final nativeHandle:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/security/sdk/SecurityConfig$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/security/sdk/SecurityConfig$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/security/sdk/SecurityConfig;->Companion:Lcom/nothing/security/sdk/SecurityConfig$a;

    const-string v0, "securityJni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/nothing/security/sdk/SecurityConfig;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 4

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-direct {p0, p1}, Lcom/nothing/security/sdk/SecurityConfig;->nativeInit(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/nothing/security/sdk/SecurityConfig;->nativeHandle:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/h;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    .line 4
    const-string p1, ""

    .line 5
    :cond_6
    invoke-direct {p0, p1}, Lcom/nothing/security/sdk/SecurityConfig;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private final native nativeInit(Ljava/lang/String;)J
.end method


# virtual methods
.method public final native fetchCustomData(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public final native fetchKey1(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public final native fetchKey2(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public final native fetchKey3(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public final native fetchKey4(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public final native fetchKey5(Landroid/content/Context;)Ljava/lang/String;
.end method
