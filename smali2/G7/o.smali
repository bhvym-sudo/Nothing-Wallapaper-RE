.class public final synthetic LG7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Le3/g;

.field public final synthetic r:LJ7/i;


# direct methods
.method public synthetic constructor <init>(Le3/g;LJ7/i;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/o;->q:Le3/g;

    iput-object p2, p0, LG7/o;->r:LJ7/i;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LG7/o;->q:Le3/g;

    iget-object p0, p0, LG7/o;->r:LJ7/i;

    invoke-static {v0, p0, p1}, LG7/p;->a(Le3/g;LJ7/i;Landroid/view/View;)V

    return-void
.end method
