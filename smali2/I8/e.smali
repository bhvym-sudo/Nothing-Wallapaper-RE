.class final LI8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# static fields
.field public static final q:LI8/e;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LI8/e;

    invoke-direct {v0}, LI8/e;-><init>()V

    sput-object v0, LI8/e;->q:LI8/e;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
