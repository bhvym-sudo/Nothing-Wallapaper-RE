.class public final Lcom/nothing/launcher/card/p;
.super Lcom/nothing/cardhost/f;
.source "SourceFile"


# instance fields
.field private A:Lv8/p;

.field private B:Lv8/l;

.field private final C:Landroid/util/SparseArray;

.field private final z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lv8/p;Lv8/l;)V
    .registers 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/nothing/cardhost/f;-><init>(Landroid/content/Context;ILv5/a;ILkotlin/jvm/internal/h;)V

    iput-object v2, v1, Lcom/nothing/launcher/card/p;->z:Landroid/content/Context;

    iput-object p2, v1, Lcom/nothing/launcher/card/p;->A:Lv8/p;

    iput-object p3, v1, Lcom/nothing/launcher/card/p;->B:Lv8/l;

    new-instance p0, Landroid/util/SparseArray;

    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    iput-object p0, v1, Lcom/nothing/launcher/card/p;->C:Landroid/util/SparseArray;

    return-void
.end method

.method public static synthetic w0(LF5/m;Lcom/nothing/launcher/card/p;ILandroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/launcher/card/p;->x0(LF5/m;Lcom/nothing/launcher/card/p;ILandroid/view/View;)V

    return-void
.end method

.method private static final x0(LF5/m;Lcom/nothing/launcher/card/p;ILandroid/view/View;)V
    .registers 5

    if-eqz p0, :cond_a

    invoke-virtual {p0}, LF5/m;->d()I

    move-result p3

    const/4 v0, 0x3

    if-ne p3, v0, :cond_a

    goto :goto_13

    :cond_a
    if-eqz p0, :cond_1e

    invoke-virtual {p0}, LF5/m;->d()I

    move-result p3

    const/4 v0, 0x2

    if-ne p3, v0, :cond_1e

    :goto_13
    iget-object p1, p1, Lcom/nothing/launcher/card/p;->A:Lv8/p;

    if-eqz p1, :cond_1e

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    return-void
.end method


# virtual methods
.method public A()V
    .registers 1

    invoke-super {p0}, Lcom/nothing/cardhost/f;->A()V

    iget-object p0, p0, Lcom/nothing/launcher/card/p;->C:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method

.method public D(I)V
    .registers 2

    invoke-super {p0, p1}, Lcom/nothing/cardhost/f;->D(I)V

    iget-object p0, p0, Lcom/nothing/launcher/card/p;->C:Landroid/util/SparseArray;

    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public S(I)V
    .registers 2

    invoke-super {p0, p1}, Lcom/nothing/cardhost/f;->S(I)V

    iget-object p0, p0, Lcom/nothing/launcher/card/p;->B:Lv8/l;

    if-eqz p0, :cond_e

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    return-void
.end method

.method public U(Landroid/content/Context;ILF5/m;Z)Lcom/nothing/cardhost/g;
    .registers 6

    const-string p4, "context"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, Lcom/nothing/launcher/card/s;

    iget-object v0, p0, Lcom/nothing/launcher/card/p;->B:Lv8/l;

    invoke-direct {p4, p1, v0}, Lcom/nothing/launcher/card/s;-><init>(Landroid/content/Context;Lv8/l;)V

    new-instance p1, Lcom/nothing/launcher/card/o;

    invoke-direct {p1, p3, p0, p2}, Lcom/nothing/launcher/card/o;-><init>(LF5/m;Lcom/nothing/launcher/card/p;I)V

    invoke-virtual {p4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p0, p0, Lcom/nothing/launcher/card/p;->C:Landroid/util/SparseArray;

    invoke-virtual {p0, p2, p4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p4
.end method

.method public r0()V
    .registers 2

    invoke-super {p0}, Lcom/nothing/cardhost/f;->r0()V

    invoke-virtual {p0}, Lcom/nothing/launcher/card/p;->A()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/launcher/card/p;->B:Lv8/l;

    iput-object v0, p0, Lcom/nothing/launcher/card/p;->A:Lv8/p;

    return-void
.end method

.method public final y0(F)V
    .registers 5

    iget-object p0, p0, Lcom/nothing/launcher/card/p;->C:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_18

    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/launcher/card/s;

    invoke-virtual {v2, p1}, Lcom/nothing/launcher/card/s;->setDeleteIconAlpha(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_18
    return-void
.end method

.method public final z0(Ld/c;ILF5/m;)V
    .registers 7

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metaInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_a
    invoke-virtual {p3}, LF5/m;->m()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_4c

    :cond_11
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.nothing.action.APPWIDGET_CONFIGURE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "widget_id"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "host_packagename"

    iget-object v2, p0, Lcom/nothing/launcher/card/p;->z:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance p2, Landroid/content/ComponentName;

    invoke-virtual {p3}, LF5/m;->H()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p1, v1}, Ld/c;->b(Ljava/lang/Object;)V
    :try_end_37
    .catch Landroid/content/ActivityNotFoundException; {:try_start_a .. :try_end_37} :catch_38

    return-void

    :catch_38
    iget-object p0, p0, Lcom/nothing/launcher/card/p;->z:Landroid/content/Context;

    sget p2, Lcom/android/launcher3/t;->b:I

    const/4 p3, 0x0

    invoke-static {p0, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p1}, Ld/c;->a()Le/a;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p3, p1}, Le/a;->c(ILandroid/content/Intent;)Ljava/lang/Object;

    :goto_4c
    return-void
.end method
