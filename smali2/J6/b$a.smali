.class public final LJ6/b$a;
.super Lg3/r$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final h:Ljava/lang/String;

.field private i:I

.field private final j:I

.field private final k:Ljava/lang/String;

.field private final l:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Landroid/util/AttributeSet;)V
    .registers 7

    const-string v0, "res"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lg3/r$a;-><init>(Landroid/content/res/Resources;Landroid/util/AttributeSet;)V

    const-string v0, "id"

    const/4 v1, 0x0

    invoke-interface {p2, v1, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    if-nez v0, :cond_19

    move-object v0, v2

    :cond_19
    iput-object v0, p0, LJ6/b$a;->h:Ljava/lang/String;

    const-string v0, "priority"

    const/4 v3, -0x1

    invoke-interface {p2, v1, v0, v3}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LJ6/b$a;->i:I

    const-string v0, "title"

    const/4 v3, 0x0

    invoke-interface {p2, v1, v0, v3}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p2

    iput p2, p0, LJ6/b$a;->j:I

    if-nez p2, :cond_30

    goto :goto_39

    :cond_30
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string p1, "getString(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_39
    iput-object v2, p0, LJ6/b$a;->k:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LJ6/b$a;->l:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lg3/x;)Lg3/r$a;
    .registers 2

    invoke-virtual {p0, p1}, LJ6/b$a;->e(Lg3/x;)LJ6/b$a;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic b()Lg3/r;
    .registers 1

    invoke-virtual {p0}, LJ6/b$a;->f()LJ6/b;

    move-result-object p0

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LJ6/b$a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic d(I)Lg3/r$a;
    .registers 2

    invoke-virtual {p0, p1}, LJ6/b$a;->g(I)LJ6/b$a;

    move-result-object p0

    return-object p0
.end method

.method public e(Lg3/x;)LJ6/b$a;
    .registers 3

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ6/b$a;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public f()LJ6/b;
    .registers 5

    new-instance v0, LJ6/b;

    iget-object v1, p0, LJ6/b$a;->k:Ljava/lang/String;

    iget-object v2, p0, LJ6/b$a;->h:Ljava/lang/String;

    iget-object v3, p0, LJ6/b$a;->l:Ljava/util/List;

    iget p0, p0, LJ6/b$a;->i:I

    invoke-direct {v0, v1, v2, v3, p0}, LJ6/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    return-object v0
.end method

.method public g(I)LJ6/b$a;
    .registers 3

    iget v0, p0, LJ6/b$a;->i:I

    if-gez v0, :cond_6

    iput p1, p0, LJ6/b$a;->i:I

    :cond_6
    return-object p0
.end method
