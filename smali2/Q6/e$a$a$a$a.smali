.class final LQ6/e$a$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ6/e$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Landroid/widget/LinearLayout;

.field final synthetic r:Lv8/l;


# direct methods
.method constructor <init>(Landroid/widget/LinearLayout;Lv8/l;)V
    .registers 3

    iput-object p1, p0, LQ6/e$a$a$a$a;->q:Landroid/widget/LinearLayout;

    iput-object p2, p0, LQ6/e$a$a$a$a;->r:Lv8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 4

    sget-object p2, LQ6/e;->a:LQ6/e;

    iget-object v0, p0, LQ6/e$a$a$a$a;->q:Landroid/widget/LinearLayout;

    iget-object p0, p0, LQ6/e$a$a$a$a;->r:Lv8/l;

    invoke-static {p2, p1, v0, p0}, LQ6/e;->b(LQ6/e;Ljava/util/List;Landroid/view/ViewGroup;Lv8/l;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, LQ6/e$a$a$a$a;->a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
