.class public final Lq6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/Toast;

.field private b:Z

.field private final c:LF8/L;


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm8/a;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v0

    iput-object v0, p0, Lq6/d;->c:LF8/L;

    return-void
.end method

.method public static final synthetic a(Lq6/d;Landroid/content/Context;Ljava/lang/String;ILm8/e;)Ljava/lang/Object;
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Lq6/d;->e(Landroid/content/Context;Ljava/lang/String;ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(Landroid/content/Context;Ljava/lang/String;I)V
    .registers 12

    iget-boolean v0, p0, Lq6/d;->b:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Lq6/d;->c:LF8/L;

    new-instance v2, Lq6/d$a;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v2 .. v7}, Lq6/d$a;-><init>(Lq6/d;Landroid/content/Context;Ljava/lang/String;ILm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final e(Landroid/content/Context;Ljava/lang/String;ILm8/e;)Ljava/lang/Object;
    .registers 10

    instance-of v0, p4, Lq6/d$b;

    if-eqz v0, :cond_13

    move-object v0, p4

    check-cast v0, Lq6/d$b;

    iget v1, v0, Lq6/d$b;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lq6/d$b;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, Lq6/d$b;

    invoke-direct {v0, p0, p4}, Lq6/d$b;-><init>(Lq6/d;Lm8/e;)V

    :goto_18
    iget-object p4, v0, Lq6/d$b;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lq6/d$b;->t:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_36

    if-ne v2, v4, :cond_2e

    iget-object p0, v0, Lq6/d$b;->q:Ljava/lang/Object;

    check-cast p0, Lq6/d;

    invoke-static {p4}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_83

    :cond_2e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_36
    invoke-static {p4}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lq6/d;->b()V

    new-instance p4, Landroid/widget/Toast;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p4, v2, v3}, Landroid/widget/Toast;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    iput-object p4, p0, Lq6/d;->a:Landroid/widget/Toast;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p4, 0x7f0d017e

    invoke-virtual {p1, p4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const p4, 0x7f0a02ef

    invoke-virtual {p1, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    invoke-virtual {p4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lq6/d;->a:Landroid/widget/Toast;

    if-eqz p2, :cond_68

    invoke-virtual {p2, p3}, Landroid/widget/Toast;->setDuration(I)V

    invoke-virtual {p2, p1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    :cond_68
    iput-boolean v4, p0, Lq6/d;->b:Z

    iget-object p1, p0, Lq6/d;->a:Landroid/widget/Toast;

    if-eqz p1, :cond_71

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_71
    if-ne p3, v4, :cond_76

    const-wide/16 p1, 0xdac

    goto :goto_78

    :cond_76
    const-wide/16 p1, 0x7d0

    :goto_78
    iput-object p0, v0, Lq6/d$b;->q:Ljava/lang/Object;

    iput v4, v0, Lq6/d$b;->t:I

    invoke-static {p1, p2, v0}, LF8/W;->b(JLm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_83

    return-object v1

    :cond_83
    :goto_83
    const/4 p1, 0x0

    iput-boolean p1, p0, Lq6/d;->b:Z

    iput-object v3, p0, Lq6/d;->a:Landroid/widget/Toast;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .registers 2

    iget-object v0, p0, Lq6/d;->a:Landroid/widget/Toast;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    :cond_7
    const/4 v0, 0x0

    iput-object v0, p0, Lq6/d;->a:Landroid/widget/Toast;

    return-void
.end method

.method public final d(Landroid/content/Context;Ljava/lang/String;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lq6/d;->c(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method
