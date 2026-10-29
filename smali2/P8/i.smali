.class public final LP8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/i$b;
    }
.end annotation


# static fields
.field public static final A:LP8/i;

.field public static final A0:LP8/i;

.field public static final B:LP8/i;

.field public static final B0:LP8/i;

.field public static final C:LP8/i;

.field public static final C0:LP8/i;

.field public static final D:LP8/i;

.field public static final D0:LP8/i;

.field public static final E:LP8/i;

.field public static final E0:LP8/i;

.field public static final F:LP8/i;

.field public static final F0:LP8/i;

.field public static final G:LP8/i;

.field public static final G0:LP8/i;

.field public static final H:LP8/i;

.field public static final H0:LP8/i;

.field public static final I:LP8/i;

.field public static final I0:LP8/i;

.field public static final J:LP8/i;

.field public static final J0:LP8/i;

.field public static final K:LP8/i;

.field public static final K0:LP8/i;

.field public static final L:LP8/i;

.field public static final L0:LP8/i;

.field public static final M:LP8/i;

.field public static final M0:LP8/i;

.field public static final N:LP8/i;

.field public static final N0:LP8/i;

.field public static final O:LP8/i;

.field public static final O0:LP8/i;

.field public static final P:LP8/i;

.field public static final P0:LP8/i;

.field public static final Q:LP8/i;

.field public static final Q0:LP8/i;

.field public static final R:LP8/i;

.field public static final R0:LP8/i;

.field public static final S:LP8/i;

.field public static final S0:LP8/i;

.field public static final T:LP8/i;

.field public static final T0:LP8/i;

.field public static final U:LP8/i;

.field public static final U0:LP8/i;

.field public static final V:LP8/i;

.field public static final V0:LP8/i;

.field public static final W:LP8/i;

.field public static final W0:LP8/i;

.field public static final X:LP8/i;

.field public static final X0:LP8/i;

.field public static final Y:LP8/i;

.field public static final Y0:LP8/i;

.field public static final Z:LP8/i;

.field public static final Z0:LP8/i;

.field public static final a0:LP8/i;

.field public static final a1:LP8/i;

.field public static final b:LP8/i$b;

.field public static final b0:LP8/i;

.field public static final b1:LP8/i;

.field private static final c:Ljava/util/Comparator;

.field public static final c0:LP8/i;

.field public static final c1:LP8/i;

.field private static final d:Ljava/util/Map;

.field public static final d0:LP8/i;

.field public static final d1:LP8/i;

.field public static final e:LP8/i;

.field public static final e0:LP8/i;

.field public static final e1:LP8/i;

.field public static final f:LP8/i;

.field public static final f0:LP8/i;

.field public static final f1:LP8/i;

.field public static final g:LP8/i;

.field public static final g0:LP8/i;

.field public static final g1:LP8/i;

.field public static final h:LP8/i;

.field public static final h0:LP8/i;

.field public static final h1:LP8/i;

.field public static final i:LP8/i;

.field public static final i0:LP8/i;

.field public static final i1:LP8/i;

.field public static final j:LP8/i;

.field public static final j0:LP8/i;

.field public static final j1:LP8/i;

.field public static final k:LP8/i;

.field public static final k0:LP8/i;

.field public static final k1:LP8/i;

.field public static final l:LP8/i;

.field public static final l0:LP8/i;

.field public static final l1:LP8/i;

.field public static final m:LP8/i;

.field public static final m0:LP8/i;

.field public static final m1:LP8/i;

.field public static final n:LP8/i;

.field public static final n0:LP8/i;

.field public static final n1:LP8/i;

.field public static final o:LP8/i;

.field public static final o0:LP8/i;

.field public static final o1:LP8/i;

.field public static final p:LP8/i;

.field public static final p0:LP8/i;

.field public static final p1:LP8/i;

.field public static final q:LP8/i;

.field public static final q0:LP8/i;

.field public static final q1:LP8/i;

.field public static final r:LP8/i;

.field public static final r0:LP8/i;

.field public static final r1:LP8/i;

.field public static final s:LP8/i;

.field public static final s0:LP8/i;

.field public static final s1:LP8/i;

.field public static final t:LP8/i;

.field public static final t0:LP8/i;

.field public static final u:LP8/i;

.field public static final u0:LP8/i;

.field public static final v:LP8/i;

.field public static final v0:LP8/i;

.field public static final w:LP8/i;

.field public static final w0:LP8/i;

.field public static final x:LP8/i;

.field public static final x0:LP8/i;

.field public static final y:LP8/i;

.field public static final y0:LP8/i;

.field public static final z:LP8/i;

.field public static final z0:LP8/i;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LP8/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/i$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/i;->b:LP8/i$b;

    new-instance v1, LP8/i$a;

    invoke-direct {v1}, LP8/i$a;-><init>()V

    sput-object v1, LP8/i;->c:Ljava/util/Comparator;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, LP8/i;->d:Ljava/util/Map;

    const-string v1, "SSL_RSA_WITH_NULL_MD5"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->e:LP8/i;

    const-string v1, "SSL_RSA_WITH_NULL_SHA"

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->f:LP8/i;

    const-string v1, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->g:LP8/i;

    const-string v1, "SSL_RSA_WITH_RC4_128_MD5"

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->h:LP8/i;

    const-string v1, "SSL_RSA_WITH_RC4_128_SHA"

    const/4 v2, 0x5

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->i:LP8/i;

    const-string v1, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v2, 0x8

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->j:LP8/i;

    const-string v1, "SSL_RSA_WITH_DES_CBC_SHA"

    const/16 v2, 0x9

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->k:LP8/i;

    const-string v1, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    const/16 v2, 0xa

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->l:LP8/i;

    const-string v1, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v2, 0x11

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->m:LP8/i;

    const-string v1, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    const/16 v2, 0x12

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->n:LP8/i;

    const-string v1, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    const/16 v2, 0x13

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->o:LP8/i;

    const-string v1, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v2, 0x14

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->p:LP8/i;

    const-string v1, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    const/16 v2, 0x15

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->q:LP8/i;

    const-string v1, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    const/16 v2, 0x16

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->r:LP8/i;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    const/16 v2, 0x17

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->s:LP8/i;

    const-string v1, "SSL_DH_anon_WITH_RC4_128_MD5"

    const/16 v2, 0x18

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->t:LP8/i;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v2, 0x19

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->u:LP8/i;

    const-string v1, "SSL_DH_anon_WITH_DES_CBC_SHA"

    const/16 v2, 0x1a

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->v:LP8/i;

    const-string v1, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    const/16 v2, 0x1b

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->w:LP8/i;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_SHA"

    const/16 v2, 0x1e

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->x:LP8/i;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    const/16 v2, 0x1f

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->y:LP8/i;

    const-string v1, "TLS_KRB5_WITH_RC4_128_SHA"

    const/16 v2, 0x20

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->z:LP8/i;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_MD5"

    const/16 v2, 0x22

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->A:LP8/i;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    const/16 v2, 0x23

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->B:LP8/i;

    const-string v1, "TLS_KRB5_WITH_RC4_128_MD5"

    const/16 v2, 0x24

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->C:LP8/i;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    const/16 v2, 0x26

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->D:LP8/i;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    const/16 v2, 0x28

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->E:LP8/i;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->F:LP8/i;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    const/16 v2, 0x2b

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->G:LP8/i;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA"

    const/16 v2, 0x2f

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->H:LP8/i;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    const/16 v2, 0x32

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->I:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    const/16 v2, 0x33

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->J:LP8/i;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    const/16 v2, 0x34

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->K:LP8/i;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA"

    const/16 v2, 0x35

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->L:LP8/i;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    const/16 v2, 0x38

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->M:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    const/16 v2, 0x39

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->N:LP8/i;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    const/16 v2, 0x3a

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->O:LP8/i;

    const-string v1, "TLS_RSA_WITH_NULL_SHA256"

    const/16 v2, 0x3b

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->P:LP8/i;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    const/16 v2, 0x3c

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->Q:LP8/i;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    const/16 v2, 0x3d

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->R:LP8/i;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    const/16 v2, 0x40

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->S:LP8/i;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v2, 0x41

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->T:LP8/i;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v2, 0x44

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->U:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v2, 0x45

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->V:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    const/16 v2, 0x67

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->W:LP8/i;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    const/16 v2, 0x6a

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->X:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    const/16 v2, 0x6b

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->Y:LP8/i;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    const/16 v2, 0x6c

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->Z:LP8/i;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    const/16 v2, 0x6d

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->a0:LP8/i;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v2, 0x84

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->b0:LP8/i;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v2, 0x87

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->c0:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v2, 0x88

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->d0:LP8/i;

    const-string v1, "TLS_PSK_WITH_RC4_128_SHA"

    const/16 v2, 0x8a

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->e0:LP8/i;

    const-string v1, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    const/16 v2, 0x8b

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->f0:LP8/i;

    const-string v1, "TLS_PSK_WITH_AES_128_CBC_SHA"

    const/16 v2, 0x8c

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->g0:LP8/i;

    const-string v1, "TLS_PSK_WITH_AES_256_CBC_SHA"

    const/16 v2, 0x8d

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->h0:LP8/i;

    const-string v1, "TLS_RSA_WITH_SEED_CBC_SHA"

    const/16 v2, 0x96

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->i0:LP8/i;

    const-string v1, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    const/16 v2, 0x9c

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->j0:LP8/i;

    const-string v1, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    const/16 v2, 0x9d

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->k0:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    const/16 v2, 0x9e

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->l0:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    const/16 v2, 0x9f

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->m0:LP8/i;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    const/16 v2, 0xa2

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->n0:LP8/i;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    const/16 v2, 0xa3

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->o0:LP8/i;

    const-string v1, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    const/16 v2, 0xa6

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->p0:LP8/i;

    const-string v1, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    const/16 v2, 0xa7

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->q0:LP8/i;

    const-string v1, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->r0:LP8/i;

    const-string v1, "TLS_FALLBACK_SCSV"

    const/16 v2, 0x5600

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->s0:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    const v2, 0xc001

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->t0:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    const v2, 0xc002

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->u0:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    const v2, 0xc003

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->v0:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    const v2, 0xc004

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->w0:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    const v2, 0xc005

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->x0:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    const v2, 0xc006

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->y0:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    const v2, 0xc007

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->z0:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    const v2, 0xc008

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->A0:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    const v2, 0xc009

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->B0:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    const v2, 0xc00a

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->C0:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_NULL_SHA"

    const v2, 0xc00b

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->D0:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    const v2, 0xc00c

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->E0:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    const v2, 0xc00d

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->F0:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    const v2, 0xc00e

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->G0:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    const v2, 0xc00f

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->H0:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    const v2, 0xc010

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->I0:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    const v2, 0xc011

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->J0:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    const v2, 0xc012

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->K0:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    const v2, 0xc013

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->L0:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    const v2, 0xc014

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->M0:LP8/i;

    const-string v1, "TLS_ECDH_anon_WITH_NULL_SHA"

    const v2, 0xc015

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->N0:LP8/i;

    const-string v1, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    const v2, 0xc016

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->O0:LP8/i;

    const-string v1, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    const v2, 0xc017

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->P0:LP8/i;

    const-string v1, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    const v2, 0xc018

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->Q0:LP8/i;

    const-string v1, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    const v2, 0xc019

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->R0:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    const v2, 0xc023

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->S0:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    const v2, 0xc024

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->T0:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    const v2, 0xc025

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->U0:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    const v2, 0xc026

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->V0:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    const v2, 0xc027

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->W0:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    const v2, 0xc028

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->X0:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    const v2, 0xc029

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->Y0:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    const v2, 0xc02a

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->Z0:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    const v2, 0xc02b

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->a1:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    const v2, 0xc02c

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->b1:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    const v2, 0xc02d

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->c1:LP8/i;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    const v2, 0xc02e

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->d1:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    const v2, 0xc02f

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->e1:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    const v2, 0xc030

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->f1:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    const v2, 0xc031

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->g1:LP8/i;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    const v2, 0xc032

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->h1:LP8/i;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    const v2, 0xc035

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->i1:LP8/i;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    const v2, 0xc036

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->j1:LP8/i;

    const-string v1, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    const v2, 0xcca8

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->k1:LP8/i;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    const v2, 0xcca9

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->l1:LP8/i;

    const-string v1, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    const v2, 0xccaa

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->m1:LP8/i;

    const-string v1, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    const v2, 0xccac

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->n1:LP8/i;

    const-string v1, "TLS_AES_128_GCM_SHA256"

    const/16 v2, 0x1301

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->o1:LP8/i;

    const-string v1, "TLS_AES_256_GCM_SHA384"

    const/16 v2, 0x1302

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->p1:LP8/i;

    const-string v1, "TLS_CHACHA20_POLY1305_SHA256"

    const/16 v2, 0x1303

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->q1:LP8/i;

    const-string v1, "TLS_AES_128_CCM_SHA256"

    const/16 v2, 0x1304

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v1

    sput-object v1, LP8/i;->r1:LP8/i;

    const-string v1, "TLS_AES_128_CCM_8_SHA256"

    const/16 v2, 0x1305

    invoke-static {v0, v1, v2}, LP8/i$b;->a(LP8/i$b;Ljava/lang/String;I)LP8/i;

    move-result-object v0

    sput-object v0, LP8/i;->s1:LP8/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LP8/i;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/h;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, LP8/i;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a()Ljava/util/Map;
    .registers 1

    sget-object v0, LP8/i;->d:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/Comparator;
    .registers 1

    sget-object v0, LP8/i;->c:Ljava/util/Comparator;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/i;->a:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/i;->a:Ljava/lang/String;

    return-object p0
.end method
