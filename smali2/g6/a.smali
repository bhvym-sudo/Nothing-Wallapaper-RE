.class public final Lg6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg6/a;

.field private static b:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lg6/a;

    invoke-direct {v0}, Lg6/a;-><init>()V

    sput-object v0, Lg6/a;->a:Lg6/a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Z
    .registers 2

    sget-object v0, Lg6/a;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_9
    const-string v0, "NTF_LINEAR_VIBRATOR"

    invoke-static {v0}, La6/a;->a(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lg6/a;->b:Ljava/lang/Boolean;

    return v0
.end method
