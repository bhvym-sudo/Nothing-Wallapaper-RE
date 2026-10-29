.class public final synthetic LG7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LJ7/i;

.field public final synthetic r:Lv8/l;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LJ7/i;Lv8/l;Ljava/lang/Object;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/m;->q:LJ7/i;

    iput-object p2, p0, LG7/m;->r:Lv8/l;

    iput-object p3, p0, LG7/m;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    iget-object v0, p0, LG7/m;->q:LJ7/i;

    iget-object v1, p0, LG7/m;->r:Lv8/l;

    iget-object p0, p0, LG7/m;->s:Ljava/lang/Object;

    invoke-static {v0, v1, p0, p1}, LG7/l$a$b;->a(LJ7/i;Lv8/l;Ljava/lang/Object;Landroid/view/View;)V

    return-void
.end method
