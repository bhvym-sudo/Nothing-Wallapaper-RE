.class public final LF8/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/L;


# static fields
.field public static final q:LF8/r0;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LF8/r0;

    invoke-direct {v0}, LF8/r0;-><init>()V

    sput-object v0, LF8/r0;->q:LF8/r0;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public w0()Lm8/i;
    .registers 1

    sget-object p0, Lm8/j;->q:Lm8/j;

    return-object p0
.end method
