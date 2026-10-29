.class final LJ8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/e;


# static fields
.field public static final q:LJ8/r;

.field private static final r:Lm8/i;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LJ8/r;

    invoke-direct {v0}, LJ8/r;-><init>()V

    sput-object v0, LJ8/r;->q:LJ8/r;

    sget-object v0, Lm8/j;->q:Lm8/j;

    sput-object v0, LJ8/r;->r:Lm8/i;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Lm8/i;
    .registers 1

    sget-object p0, LJ8/r;->r:Lm8/i;

    return-object p0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method
