.class public final LF8/K0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/d0;
.implements LF8/s;


# static fields
.field public static final q:LF8/K0;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LF8/K0;

    invoke-direct {v0}, LF8/K0;-><init>()V

    sput-object v0, LF8/K0;->q:LF8/K0;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Throwable;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public dispose()V
    .registers 1

    return-void
.end method

.method public getParent()LF8/x0;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "NonDisposableHandle"

    return-object p0
.end method
