.class public final LJ8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# static fields
.field public static final q:LJ8/s;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LJ8/s;

    invoke-direct {v0}, LJ8/s;-><init>()V

    sput-object v0, LJ8/s;->q:LJ8/s;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
