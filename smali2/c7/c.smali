.class public final synthetic Lc7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lc7/b$b;

.field public final synthetic r:Lc7/b;


# direct methods
.method public synthetic constructor <init>(Lc7/b$b;Lc7/b;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/c;->q:Lc7/b$b;

    iput-object p2, p0, Lc7/c;->r:Lc7/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lc7/c;->q:Lc7/b$b;

    iget-object p0, p0, Lc7/c;->r:Lc7/b;

    invoke-static {v0, p0, p1}, Lc7/b$b;->d(Lc7/b$b;Lc7/b;Landroid/view/View;)V

    return-void
.end method
