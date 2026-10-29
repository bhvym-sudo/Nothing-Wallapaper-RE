.class public final LI8/K$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI8/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LI8/K$a;

.field private static final b:LI8/K;

.field private static final c:LI8/K;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LI8/K$a;

    invoke-direct {v0}, LI8/K$a;-><init>()V

    sput-object v0, LI8/K$a;->a:LI8/K$a;

    new-instance v0, LI8/L;

    invoke-direct {v0}, LI8/L;-><init>()V

    sput-object v0, LI8/K$a;->b:LI8/K;

    new-instance v0, LI8/M;

    invoke-direct {v0}, LI8/M;-><init>()V

    sput-object v0, LI8/K$a;->c:LI8/K;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LI8/K$a;JJILjava/lang/Object;)LI8/K;
    .registers 7

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_6

    const-wide/16 p1, 0x0

    :cond_6
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_f

    const-wide p3, 0x7fffffffffffffffL

    :cond_f
    invoke-virtual {p0, p1, p2, p3, p4}, LI8/K$a;->a(JJ)LI8/K;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JJ)LI8/K;
    .registers 5

    new-instance p0, LI8/N;

    invoke-direct {p0, p1, p2, p3, p4}, LI8/N;-><init>(JJ)V

    return-object p0
.end method

.method public final c()LI8/K;
    .registers 1

    sget-object p0, LI8/K$a;->b:LI8/K;

    return-object p0
.end method

.method public final d()LI8/K;
    .registers 1

    sget-object p0, LI8/K$a;->c:LI8/K;

    return-object p0
.end method
