.class public final synthetic Ld7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lkotlin/jvm/internal/E;

.field public final synthetic c:Li7/d;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/d;->a:Landroid/content/Context;

    iput-object p2, p0, Ld7/d;->b:Lkotlin/jvm/internal/E;

    iput-object p3, p0, Ld7/d;->c:Li7/d;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .registers 4

    iget-object v0, p0, Ld7/d;->a:Landroid/content/Context;

    iget-object v1, p0, Ld7/d;->b:Lkotlin/jvm/internal/E;

    iget-object p0, p0, Ld7/d;->c:Li7/d;

    invoke-static {v0, v1, p0, p1}, Ld7/l;->d(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method
