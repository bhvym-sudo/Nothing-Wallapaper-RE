.class final LF8/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i$b;
.implements Lm8/i$c;


# static fields
.field public static final q:LF8/b1;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LF8/b1;

    invoke-direct {v0}, LF8/b1;-><init>()V

    sput-object v0, LF8/b1;->q:LF8/b1;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, Lm8/i$b$a;->a(Lm8/i$b;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public b(Lm8/i$c;)Lm8/i$b;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->b(Lm8/i$b;Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    return-object p0
.end method

.method public getKey()Lm8/i$c;
    .registers 1

    return-object p0
.end method

.method public t0(Lm8/i$c;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->c(Lm8/i$b;Lm8/i$c;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public z(Lm8/i;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->d(Lm8/i$b;Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method
