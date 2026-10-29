.class final LF8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/L0;


# static fields
.field public static final q:LF8/d;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LF8/d;

    invoke-direct {v0}, LF8/d;-><init>()V

    sput-object v0, LF8/d;->q:LF8/d;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "Active"

    return-object p0
.end method
