.class final LI8/D;
.super LI8/a;
.source "SourceFile"


# instance fields
.field private final q:Lv8/p;


# direct methods
.method public constructor <init>(Lv8/p;)V
    .registers 2

    invoke-direct {p0}, LI8/a;-><init>()V

    iput-object p1, p0, LI8/D;->q:Lv8/p;

    return-void
.end method


# virtual methods
.method public f(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LI8/D;->q:Lv8/p;

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_d

    return-object p0

    :cond_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
