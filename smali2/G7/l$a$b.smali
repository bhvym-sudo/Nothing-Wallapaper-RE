.class final LG7/l$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:[Lh8/o;

.field final synthetic r:[Ljava/lang/Object;

.field final synthetic s:LJ7/i;

.field final synthetic t:Lv8/l;


# direct methods
.method constructor <init>([Lh8/o;[Ljava/lang/Object;LJ7/i;Lv8/l;)V
    .registers 5

    iput-object p1, p0, LG7/l$a$b;->q:[Lh8/o;

    iput-object p2, p0, LG7/l$a$b;->r:[Ljava/lang/Object;

    iput-object p3, p0, LG7/l$a$b;->s:LJ7/i;

    iput-object p4, p0, LG7/l$a$b;->t:Lv8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LJ7/i;Lv8/l;Ljava/lang/Object;Landroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LG7/l$a$b;->e(LJ7/i;Lv8/l;Ljava/lang/Object;Landroid/view/View;)V

    return-void
.end method

.method private static final e(LJ7/i;Lv8/l;Ljava/lang/Object;Landroid/view/View;)V
    .registers 4

    invoke-virtual {p0}, LJ7/i;->n0()Z

    move-result p0

    if-nez p0, :cond_9

    invoke-interface {p1, p2}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lh8/o;

    invoke-virtual {p0, p1, p2}, LG7/l$a$b;->c(Lh8/o;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final c(Lh8/o;Lm8/e;)Ljava/lang/Object;
    .registers 13

    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, LG7/l$a$b;->q:[Lh8/o;

    iget-object v1, p0, LG7/l$a$b;->r:[Ljava/lang/Object;

    iget-object v2, p0, LG7/l$a$b;->s:LJ7/i;

    iget-object p0, p0, LG7/l$a$b;->t:Lv8/l;

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_15
    if-ge v4, v3, :cond_52

    aget-object v6, v0, v4

    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v6}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v6}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    aget-object v5, v1, v5

    if-eqz v8, :cond_32

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_32
    sget-object v8, LG7/l;->a:LG7/l;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    invoke-static {v8, p1, v9}, LG7/l;->c(LG7/l;Ljava/lang/String;Z)Z

    move-result v8

    invoke-virtual {v6, v8}, Landroid/view/View;->setEnabled(Z)V

    invoke-static {p2, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setSelected(Z)V

    new-instance v8, LG7/m;

    invoke-direct {v8, v2, p0, v5}, LG7/m;-><init>(LJ7/i;Lv8/l;Ljava/lang/Object;)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_15

    :cond_52
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
